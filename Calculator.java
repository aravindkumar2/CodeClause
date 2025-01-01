package practise;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueCalculation = 0;

        System.out.println("Welcome to the Basic Calculator!");

        do {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Choose an operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

            double result = 0;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue; // Skip to the next iteration of the loop
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Please enter one of +, -, *, /.");
                    continue; // Skip to the next iteration of the loop
            }

            System.out.println("The result is: " + result);

            System.out.print("Do you want to perform another calculation? (y/n): ");
            continueCalculation = scanner.next().charAt(0);

        } while (continueCalculation == 'y' || continueCalculation == 'Y');

        System.out.println("Thank you for using the Basic Calculator. Goodbye!");
        scanner.close();
    }
}
