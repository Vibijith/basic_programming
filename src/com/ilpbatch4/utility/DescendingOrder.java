package com.ilpbatch4.utility;

public class DescendingOrder {

	public static void main(String[] args) {
		int number1 = 500;
		int number2 = 600;
		int number3 = 800;
		
		descentingorder(number1,number2,number3);
		
	}
	
	private static void descentingorder(int number1, int number2, int number3)
	{
		if((number1>number2) && (number1>number3))
		{
			System.out.print(number1);
			if(number2>number3)
			{
				System.out.print(" "+number2);
				System.out.print(" "+number3);
			}
			else 
			{
				System.out.print(" "+number3);
				System.out.print(" "+number2);
			}
		}
		if((number2>number1)&& (number2>number3))
				{
					System.out.print(number2);
					if(number1>number3)
					{
						System.out.print(" "+number1);
						System.out.print(" "+number3);
					}
					else 
					{
						System.out.print(" "+number3);
						System.out.print(" "+number1);
					}
				}
		if((number3>number1)&& (number3>number2))
				{
					System.out.print(number3);
					if(number1>number2)
					{
						System.out.print(" "+number1);
						System.out.print(" "+number2);
					}
					else 
					{
						System.out.print(" "+number2);
						System.out.print(" "+number1);
					}
				}
	}
}
