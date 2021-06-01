package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionTest extends BaseTest {
    @Test(expectedExceptions = ArithmeticException.class, priority = 1, description = "division by zero test")
    public void divisionByZeroTest() {
        calculator.division(1, 0);
    }

    @Test(description = "Incoming data for method division", priority = 1)
    public void divisionTest() {
        Assert.assertEquals(calculator.division(8, 2), 4);
    }

    @Test(description = "Incoming data for method division", priority = 1)
    public void divisionRoundDataTest() {
        Assert.assertEquals(calculator.division(2, 4), 0);
    }
}
