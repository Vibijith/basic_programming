package com.ilpbatch4.utility;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		int input = 3;
		factorial(input);
		// int a = factorial(5);
		sumOfFactorial(input);
		System.out.println(a);
	}
	public static int factorial(int input) {
		
		int factorial = 1;
		for (int i = 1; i <= input; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
	private static void sumOfFactorial(int input) {
		
		float sum = 0;
		for (int i = 1; i <= input; i++) {
			sum = sum + (float) i / (float) factorial(i);
		}
		System.out.println("Sum=" + sum);
	}
}

