package billing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodTest {

    @Test
    void calculateFoodTotal() {
        Products products = new Products("Rice", 1);
        //Products products1 = new Products("Juice", 1);
        Products products3 = new Products("AC", 1);
        Products products4 = new Products("TV", 1);
        Products products5 = new Products("Bed", 1);
        Products products6 = new Products("Sofa", 1);
        Products products2 = new Products("Rice", 1);
        Products products8 = new Products("Daal", 1);
        Food food=new Food();
        assertEquals(140.0,food.calculateFoodTotal());
    }
}





