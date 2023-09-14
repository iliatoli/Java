package com.as5op1;

import java.util.Scanner;

public class RecursiveProductCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[5];

        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        double product = calculateProduct(numbers, 0);
        System.out.println("The product of the five numbers is: " + product);

        scanner.close();
    }

    // Recursive method to calculate the product of an array of numbers
    public static double calculateProduct(double[] numbers, int index) {
        if (index == numbers.length - 1) {
            return numbers[index];
        } else {
            return numbers[index] * calculateProduct(numbers, index + 1);
        }
    }
}
