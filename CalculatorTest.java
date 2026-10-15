public class CalculatorTest {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        test("Addition", c.add(5, 3), 8);
        test("Subtraction", c.subtract(5, 3), 2);
        test("Multiplication", c.multiply(5, 3), 15);
        test("Division", c.divide(6, 3), 2.0);

        try {
            c.divide(6, 0);
            System.out.println("FAIL: Division by zero");
        } catch (IllegalArgumentException e) {
            System.out.println("PASS: Division by zero");
        }
    }

    static void test(String name, double actual,
                     double expected) {
        if (actual == expected) {
            System.out.println("PASS: " + name);
        } else {
            System.out.println("FAIL: " + name);
        }
    }
}
