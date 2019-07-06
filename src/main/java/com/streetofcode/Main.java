package com.streetofcode;

import com.streetofcode.calculator.CalculatorHolder;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CalculatorHolder calculatorHolder = new CalculatorHolder();

        do {
            System.out.println("Write number, then type of operation (+, -, /, *) and number again. i.e. 6 / 2 or 3 - 1");

            final double left;
            final char operator;
            final double right;

            try {
                left = scanner.nextDouble();
                operator = scanner.next().charAt(0);
                right = scanner.nextDouble();
            } catch (IllegalArgumentException e) {
                System.out.println("Mistakes were made: " + e);
                return;
            }

            Operands operands = new Operands(left, right);
            final double result = calculatorHolder.calculate(operands, operator);

            System.out.println("Result is " + result);
        } while(true);

    }
}
