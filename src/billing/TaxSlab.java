package billing;

public class TaxSlab {

    private double foodTax = 0.0, furnitureTax = 0.05, electronicsTax = 0.1;

    public double getFoodTax() {
        return foodTax;
    }

    public double getFurnitureTax() {
        return furnitureTax;
    }

    public double getElectronicsTax() {
        return electronicsTax;
    }
}
