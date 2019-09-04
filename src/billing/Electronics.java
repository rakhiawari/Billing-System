package billing;

public class Electronics {
    private int quantity;
    private double productPrice, tax;
    static double totalElectronics;

    public Electronics() {
    }

    public Electronics(int quantity, double productPrice) {
        this.quantity = quantity;
        this.productPrice = productPrice;
        this.calculateElectronicsTotal();
    }

    public double calculateElectronicsTotal() {
        TaxSlab taxCalculate = new TaxSlab();
        tax = taxCalculate.getElectronicsTax();
        totalElectronics += ((productPrice * quantity) + (tax * (productPrice * quantity)));
        return totalElectronics;
    }
}

