package com.ilpbatch4.utility;
 
public class patternPrinting_final {
 
	public static void main(String[] args) {
		int n=4;
		printAlphaNumericPattern(n);
 
	}
 
	private static void printAlphaNumericPattern(int n) {
		int a=65;
		
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>i;j--){
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++) {
				
				System.out.print((char)(a));
				a++;
			}
			for(int l=0;l<=i;l++) {
				System.out.print(l+1);
				
			}
			System.out.println();
			a=65;
		}
	}
}