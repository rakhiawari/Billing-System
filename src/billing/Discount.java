package billing;

public class Discount {

    public double applyDiscount() {

        Food food = new Food();
        Furniture furniture = new Furniture();
        Electronics electronics = new Electronics();

        double foodBill = food.calculateFoodTotal();
        if (foodBill >= 1000) {
            foodBill = ((foodBill * 0.1) + foodBill);
            System.out.println("Food Bill Discount: " + (foodBill * 0.1));
        }
        double furnitureBill = furniture.calculateFurnitureTotal();
        if (furnitureBill >= 30000) {
            furnitureBill = ((furnitureBill * 0.1) + furnitureBill);
            System.out.println("Furniture Bill Discount: " + (furnitureBill * 0.1));
        }
        double electronicsBill = electronics.calculateElectronicsTotal();
        if (electronicsBill >= 50000) {
            electronicsBill = ((electronicsBill * 0.1) + electronicsBill);
            System.out.println("Electronics Bill Discount: " + (electronicsBill * 0.1));
        }
        System.out.println("Total Food Bill:" + foodBill);
        System.out.println("Total Furniture Bill:" + furnitureBill);
        System.out.println("Total Electronics Bill:" + electronicsBill);
        return (foodBill + furnitureBill + electronicsBill);
    }
}

