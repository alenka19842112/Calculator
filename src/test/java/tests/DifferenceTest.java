package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DifferenceTest extends BaseTest {
    @DataProvider(name = "Incoming data for method difference")
    public Object[][] inputForSum() {
        return new Object[][]{
                {5, 5, 0},
                {-5, 5, -10},
                {-5, -5, 0},
                {0, 0, 0}
        };
    }

    @Test(dataProvider = "Incoming data for method difference", priority = 1, description = "four tests for difference")
    public void differenceTest(int a, int b, int expectedDifference) {
        Assert.assertEquals(calculator.difference(a, b), expectedDifference);
    }
}
