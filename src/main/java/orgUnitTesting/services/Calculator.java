package orgUnitTesting.services;

public class Calculator {


    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }

    public static int productTwoNumbers(int a, int b) {
        return a * b;
    }

    public static String compare(int number1, int number2) {
        if (number1 > number2) {
            return "Number1 is Greater";
        } else if (number1 == number2) {
            return "Number1 == Number2";
        } else {
            return "Number2 is Greater";
        }
    }
}

