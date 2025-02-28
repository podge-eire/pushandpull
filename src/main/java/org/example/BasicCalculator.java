package org.example;

public class BasicCalculator {

    public int addFunction(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int d) {
        return a - d;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }


    public int doCalculation(String calcType, int number, int number2) {

        switch (calcType) {
            case "add":
                System.out.println("You chose to add the numbers");
                return addFunction(number, number2);
            case "subtract":
                System.out.println("You chose to subtract the numbers");
                return subtract(number, number2);
            case "multiply":
                System.out.println("You chose to multiply the numbers");
                return multiply(number, number2);
            case "divide":
                System.out.println("You chose to divide the numbers");
                return divide(number, number2);
            default:
                System.out.println("You chose an invalid operation");
                return 0;
        }

    }

}
