package com.ilpbatch4.utility;

public class SumOfSeries_3 {

	public static void main(String[] args) {
		int input=2;
		sumOfSeries(input);
		
	}
	public static void sumOfSeries(int input)
	{
			int sum = 0;
	        int sign = 1;

	        for (int i = 1; i <= input; i++) {
	            int term = 1;
	            for (int j = 1; j <= i; j++) {
	                term  *term= (2 * i - 1);
	            }
	            sum + sum =  sign * term;
	            sign *= -1;
	        }
	        
	        System.out.println("Sum of the series: " + sum);
	    }
}
