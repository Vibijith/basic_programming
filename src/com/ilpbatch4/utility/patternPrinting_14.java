package com.ilpbatch4.utility;

public class patternPrinting_14 {

	public static void main(String[] args) {
		int N = 5;
        printPattern(N);

	}

	private static void printPattern(int n) {
		int mid = (n + 1) / 2;

        // Upper part including the middle row
        for (int i = 1; i <= mid; i++) {
            // Print leading spaces
            for (int j = 0; j < mid - i; j++) {
                System.out.print("  ");
            }
            // Print decreasing part
            for (int j = i; j > 1; j--) {
                System.out.print(j + " ");
            }
            // Print the middle element
            System.out.print(1);
            // Print increasing part
            for (int j = 2; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }

        // Lower part excluding the middle row
        for (int i = mid - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 0; j < mid - i; j++) {
                System.out.print("  ");
            }
            // Print decreasing part
            for (int j = i; j > 1; j--) {
                System.out.print(j + " ");
            }
            // Print the middle element
            System.out.print(1);
            // Print increasing part
            for (int j = 2; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
		
	}

}
