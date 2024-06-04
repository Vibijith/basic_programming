package com.ilpbatch4.utility;
public class sortZerosAndOnes3 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 0, 1, 2, 1, 0, 2, 1, 0};
        sortArray(array);
        // Print the sorted array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    public static void sortArray(int[] array) {
        int count0 = 0, count1 = 0, count2 = 0;
        // Count the number of 0s, 1s, and 2s
        for (int num : array) {
            switch (num) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            }
        }
        int index = 0;
        // Place all 0s in the array
        for (int i = 0; i < count0; i++) {
            array[index++] = 0;
        }
        // Place all 1s in the array
        for (int i = 0; i < count1; i++) {
            array[index++] = 1;
        }
        // Place all 2s in the array
        for (int i = 0; i < count2; i++) {
            array[index++] = 2;
        }
    }
}
