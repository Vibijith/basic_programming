package com.ilpbatch4.utility;

public class zPattern {

	public static void main(String[] args) {
		int N = 6;
        printZPattern(N);

	}

	private static void printZPattern(int n)
	{
		if (n < 2) 
		{
            System.out.println("N must be greater than or equal to 2");
            return;
        }

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++)
            {
                
                if (i == 0 || i == n - 1) 
                {
                	
                	System.out.print("*");
                    
                }
                
                else if (j == n - 1 - i)
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
		
	}

}
