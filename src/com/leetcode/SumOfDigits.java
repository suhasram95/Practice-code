package com.leetcode;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {99,77,33,66,55};
		System.out.println(sumOfDigits(A));
	}
	public static int sumOfDigits(int[] A) {
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] < min) {
				min = A[i];
			}
		}
		if (min < 10) {
			sum = min;
		}
		else {
			while (min != 0) {
				int temp = min%10;
				sum = sum + temp;
				min /= 10;
			}
		}
		return sum%2 == 1 ? 0 : 1;
	}
}
