package billing;

import java.util.HashMap;

public class ProductBasket {

    private String productName;
    private int quantity;
    static HashMap<String, Integer> productList = new HashMap<>();

    public void addProductsToBasket(String productName, int quantity) {
        if (productList.containsKey(productName)) {
            int temp = productList.get(productName);
            productList.replace(productName, temp, (temp + quantity));
        } else {
            productList.put(productName, quantity);
        }
        System.out.println(productList);
    }

    public double generateBill() {
        System.out.println("Product List: " + productList);
        Discount discount = new Discount();
        double totalBill = discount.applyDiscount();
        System.out.println("Total Bill Amount: " + totalBill);
        return totalBill;
    }
}

