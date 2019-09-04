package billing;

public class Furniture {

    private int quantity;
    private double productPrice, tax;
    static double totalFurniture;

    public Furniture() {
    }

    public Furniture(int quantity, double productPrice) {
        this.quantity = quantity;
        this.productPrice = productPrice;
        this.calculateFurnitureTotal();
    }

    public double calculateFurnitureTotal() {
        TaxSlab taxCalculate = new TaxSlab();
        tax = taxCalculate.getFurnitureTax();
        totalFurniture += ((productPrice * quantity) + (tax * (productPrice * quantity)));
        return totalFurniture;
    }
}

