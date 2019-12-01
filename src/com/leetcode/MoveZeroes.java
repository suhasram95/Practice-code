package com.leetcode;

public class MoveZeroes {
	public static void main(String[] args) {
		
	}
	public static void moveZeroes(int[] nums) {
		int i = 0;
		int j = 0;
		while (j < nums.length) {
			if (nums[j] != 0) {
				nums[i++] = nums[j];
			}
			j++;
		}
		while (i < nums.length) {
			nums[i++] = 0;
		}
	}
}
