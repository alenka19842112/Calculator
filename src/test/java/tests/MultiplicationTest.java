package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplicationTest extends BaseTest {
    @DataProvider(name = "Incoming data for method multiplication")
    public Object[][] inputForSum() {
        return new Object[][]{
                {5, 5, 25},
                {-5, 5, -25},
                {-5, -5, 25},
                {0, 0, 0}
        };
    }

    @Test(dataProvider = "Incoming data for method multiplication", priority = 1, description = "Incoming data for method multiplication")
    public void multiplicationTest(int a, int b, int expectedProduct) {
        Assert.assertEquals(calculator.multiplication(a, b), expectedProduct);
    }
}
