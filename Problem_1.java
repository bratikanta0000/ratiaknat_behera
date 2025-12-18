package com.tandemloop.problem;

import java.util.Scanner;

public class Problem_1 {
	double calculate(double a, double b, String operation) {
		switch (operation) {
		case "add":
			return a + b;
		case "subtract":
			return a - b;
		case "multiply":
			return a * b;
		case "divide":
			if (b != 0) {
				return a / b;
			} else {
				System.out.println("Error: Division by zero is undefined");
				return 0;
			}
		default:
			System.out.println("Error: Invalid operation");
			return Double.NaN;
		}
	}

}
//main class
class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double a = scanner.nextDouble();
		System.out.print("Enter second number: ");
		double b = scanner.nextDouble();
		System.out.print("Enter operation (add, subtract, multiply, divide): ");
		String operation = scanner.next();
		Calculator calculator = new Calculator();
		double result = calculator.calculate(a, b, operation);
		if (!Double.isNaN(result)) {
			System.out.println("Result: " + result);
		}
		
		scanner.close();
		
		
	}
}
