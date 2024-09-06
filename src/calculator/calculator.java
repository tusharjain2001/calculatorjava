package calculator;

import java.util.Scanner;

public class calculator {

	public static double add(double num1, double num2) {
		return num1 + num2;

	}

	public static double sub(double num1, double num2) {
		return num1 - num2;

	}

	public static double mul(double num1, double num2) {
		return num1 * num2;

	}

	public static double div(double num1, double num2) {
		return num1 / num2;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Basic Calculator");
		System.out.print("Enter the first number: ");
		double num1 = scanner.nextDouble();

		System.out.print("Enter the second number: ");
		double num2 = scanner.nextDouble();

		System.out.println("Choose an operation: +, -, *, /");
		char operator = scanner.next().charAt(0);

		double result = 0;

		switch (operator) {
		case '+':
			result = add(num1, num2);
			break;
		case '-':
			result = sub(num1, num2);
			break;
		case '*':
			result = mul(num1, num2);
			break;
		case '/':
			result = div(num1, num2);
			break;
		default:
			System.out.println("Invalid operator!");
			return;
		}
		
		System.out.println("The result is: " + result);
	}

}
