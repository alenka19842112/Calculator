package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CalculatorPage;

public class BaseTest {
    CalculatorPage calculator = new CalculatorPage();

    @BeforeMethod
    public void initTest() {
        System.out.println("@BeforeMethod");
    }

    @AfterMethod(alwaysRun = true)
    public void endTest() {
        System.out.println("@AfterMethod");
    }
}
