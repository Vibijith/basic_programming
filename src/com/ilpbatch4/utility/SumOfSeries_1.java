package com.ilpbatch4.utility;

public class SumOfSeries_1 {

	public static void main(String[] args) {
		int input = 20;
		sumOfSeries(input);

	}

	
		
	
	private static void sumOfSeries(int input) 
	{
		int sum=0;
		int sign=1;

		for(int i=1;i<=input;i=i+2)
		{
			sum = sum + sign * i;
            sign = sign * -1;
			
		}
		System.out.print("Sum is :"+sum);
		
		
	}

}

