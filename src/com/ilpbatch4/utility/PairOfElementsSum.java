package com.ilpbatch4.utility;

import java.util.Arrays;

public class PairOfElementsSum {

	public static void main(String[] args) {
		int[] arr = {1, 5, 7, -1, 5};
        int K = 6;

        int pairCount = countPairsWithSum(arr, K);

        System.out.println("Number of pairs with sum " + K + ": " + pairCount);
    }

	private static int countPairsWithSum(int[] arr, int K) {
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == K) {
                count++;
                left++;
                right--;
            } else if (sum < K) {
                left++;
            } else {
                right--;
            }
        }

        return count;
	}

}


