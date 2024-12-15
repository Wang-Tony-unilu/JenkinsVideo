public class App{

    public static void main(String[] args) {
        App test = new App();
        test.testAdd();
        test.testSubtract();
        test.testMultiply();
        test.testDivide();
        test.testDivideByZero();
    }

    Calculator calculator = new Calculator();

    public void testAdd() {
        int result = calculator.add(2, 6);
        if (result == 5) {
            System.out.println("testAdd passed, result is :"+result);
        } else {
            System.out.println("testAdd failed: expected 5 but got " + result);
        }
    }

    public void testSubtract() {
        int result = calculator.subtract(3, 2);
        if (result == 1) {
            System.out.println("testSubtract passed, result is :"+ result);
        } else {
            System.out.println("testSubtract failed: expected 1 but got " + result);
        }
    }

    public void testMultiply() {
        int result = calculator.multiply(2, 3);
        if (result == 6) {
            System.out.println("testMultiply passed :"+ result);
        } else {
            System.out.println("testMultiply failed: expected 6 but got " + result);
        }
    }

    public void testDivide() {
        double result = calculator.divide(6, 3);
        if (result == 2.0) {
            System.out.println("testDivide passed :"+ result);
        } else {
            System.out.println("testDivide failed: expected 2.0 but got " + result);
        }
    }

    public void testDivideByZero() {
        try {
            calculator.divide(1, 0);
            System.out.println("testDivideByZero failed: exception was not thrown");
        } catch (IllegalArgumentException e) {
            if ("Cannot divide by zero.".equals(e.getMessage())) {
                System.out.println("testDivideByZero passed");
            } else {
                System.out.println("testDivideByZero failed: unexpected exception message: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("testDivideByZero failed: unexpected exception type: " + e);
        }
    }
}

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return (double) a / b;
    }
}
