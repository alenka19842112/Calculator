package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTest extends BaseTest {
    @DataProvider(name = "Incoming data for method sum")
    public Object[][] inputForSum() {
        return new Object[][]{
                {5, 5, 10},
                {-5, 5, 0},
                {-5, -5, -10},
                {0, 0, 0}
        };
    }

    @Test(dataProvider = "Incoming data for method sum", priority = 1, description = "four tests for sum")
    public void sumTest(int a, int b, int expectedSum) {
        Assert.assertEquals(calculator.sum(a, b), expectedSum);
    }
}
