package company;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void testCalculateRatio() {
        //given
        float value1 = 20.0F;
        float value2 = 30.0F;
        Calculator calculator = new Calculator();
        //when
        float actualResult = calculator.calculateRatio(value2, value1);
        //then
        Assertions.assertEquals( 0.6666666, actualResult, 0.000001);

    }

    @Test
    void testCalculateItems() {
    }
    @Test
    void testAddToList1() {
    }
    @Test
    void testAddToList2() {
    }
}