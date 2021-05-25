package pages;

public class CalculatorPage extends BasePage {

    public CalculatorPage() {
    }

    /**
     * the sum of two numbers
     * @param a int
     * @param b int
     * @return sum
     */
    public int sum(int a, int b) {
        return a + b;
    }

    /**
     * the difference of two numbers
     * @param a int
     * @param b int
     * @return difference
     */
    public int difference(int a, int b) {
        return a - b;
    }

    /**
     * the multiplication of two numbers
     * @param a int
     * @param b int
     * @return multiplication
     */
    public int multiplication(int a, int b) {
        return a * b;
    }

    /**
     * the division of two numbers
     * @param a int
     * @param b int
     * @return round division
     */
    public int division(int a, int b) {
        return Math.round(a / b);
    }
}
