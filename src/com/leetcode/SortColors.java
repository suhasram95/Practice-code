package com.leetcode;

public class SortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,0,2,1,1,0};
		sortColors(nums);
		for (int num:nums) {
			System.out.print(num+" ");
		}
	}
	public static void sortColors(int[] nums) {
		if (nums == null || nums.length < 2) {
			return;
		}
		int[] result = new int[3];
		for (int i = 0; i < nums.length; i++) {
			result[nums[i]]++;
		}
		int j = 0, k = 0;
		while(j <= 2) {
			if (result[j] != 0) {
				nums[k++] = j;
				result[j] = result[j]-1;
			} else {
				j++;
			}
		}
	}
}
