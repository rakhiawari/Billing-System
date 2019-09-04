package billing;

public class Food {

    private int quantity;
    private double productPrice, tax;
    static double totalFood;

    public Food() {
    }

    public Food(int quantity, double productPrice) {

        this.quantity = quantity;
        this.productPrice = productPrice;
        this.calculateFoodTotal();
    }

    public double calculateFoodTotal() {
        TaxSlab taxCalculate = new TaxSlab();
        tax = taxCalculate.getFoodTax();
        totalFood += ((productPrice * quantity) + (tax * (productPrice * quantity)));
        return totalFood;
    }

}



