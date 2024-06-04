package com.ilpbatch4.utility;

public class AscendingDescentingFourNumbers {

	public static void main(String[] args) {
		int array[]= {10,20,30,40};
		int temp[];
		
		ascending(array);

	}

	private static void ascending(int[] array) {
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]<array[j])
				{
					for(int k=0;k<array.length;k++)
					{
						temp[k]=temp[k]+array[i];
					}
				}
			}
				
			
		}
		
	}

}
