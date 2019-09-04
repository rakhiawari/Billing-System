package billing;

import billing.Electronics;
import billing.Food;
import billing.Furniture;
import billing.ProductBasket;

import java.util.HashMap;

public class Products {
    String productName;
    int quantity;
    double productPrice;

    HashMap<String, Double> foodCategory = new HashMap<>();
    HashMap<String, Integer> electronicCategory = new HashMap<>();
    HashMap<String, Integer> furnitureCategory = new HashMap<>();
    static ProductBasket productBasket = new ProductBasket();

    public Products(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
        this.categoriseProduct();
    }

    public void categoriseProduct() {

        foodCategory.put("Wafers", 120.0);
        foodCategory.put("Choco", 240.0);
        foodCategory.put("Rice", 70.0);
        foodCategory.put("Noodles", 40.0);
        foodCategory.put("Juice", 60.0);

        electronicCategory.put("TV", 40000);
        electronicCategory.put("Radio", 1500);
        electronicCategory.put("AC", 30000);
        electronicCategory.put("Smartphone", 25000);
        electronicCategory.put("Laptop", 70000);

        furnitureCategory.put("Bed", 15000);
        furnitureCategory.put("Sofa", 17000);
        furnitureCategory.put("Cabinet", 14000);
        furnitureCategory.put("Table", 3000);
        furnitureCategory.put("Chair", 1200);

        HashMap<String, String> product = new HashMap<>();

        product.put("Food", foodCategory.toString());
        product.put("Electronics", electronicCategory.toString());
        product.put("Furniture", furnitureCategory.toString());

        if (foodCategory.containsKey(productName)) {
            productPrice = foodCategory.get(productName);
            Food food = new Food(quantity, productPrice);
            productBasket.addProductsToBasket(productName, quantity);
        } else if (electronicCategory.containsKey(productName)) {
            productPrice = electronicCategory.get(productName);
            Electronics electronics = new Electronics(quantity, productPrice);
            productBasket.addProductsToBasket(productName, quantity);
        } else if (furnitureCategory.containsKey(productName)) {
            productPrice = furnitureCategory.get(productName);
            Furniture furniture = new Furniture(quantity, productPrice);
            productBasket.addProductsToBasket(productName, quantity);
        } else {
            System.out.println("Product not available.");
        }
    }

}

