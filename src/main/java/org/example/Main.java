package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** AMAZING CALCULATOR ***"+ "\n");

        BasicCalculator calculator = new BasicCalculator();
        Scanner input = new Scanner(System.in);

        // takes name input from the keyboard
        System.out.print("Enter calculation type: ");
        String calcType = input.nextLine();

        // takes number input from the keyboard
        System.out.print("Enter first number: ");
        int number = input.nextInt();

        System.out.print("Enter 2nd number: ");
        int number2 = input.nextInt();

        int result =  calculator.doCalculation(calcType, number, number2);

        System.out.println("You asked to: " + calcType);
        System.out.println("The result of the calculation is " + result);

        // closes the scanner
        input.close();

    }
}
