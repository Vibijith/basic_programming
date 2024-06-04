package com.ilpbatch4.utility;

public class SumOfSeries_2 {

	public static void main(String[] args) {
		int input=10;
		sumOfSeries(input);
		
		
		
	}
	public static void sumOfSeries(int input)
	{
	        int sum = 0;
	        int currentTerm = 1;
	        int nextTerm = 2;
	        int temp;

	        for (int i = 1; i <= input; i++) 
	        {
	            sum += currentTerm * currentTerm * currentTerm;

	            temp = nextTerm;
	            nextTerm = currentTerm + nextTerm;
	            currentTerm = temp;
	        }

	        System.out.println("Sum of the series: " + sum);
	}
}
