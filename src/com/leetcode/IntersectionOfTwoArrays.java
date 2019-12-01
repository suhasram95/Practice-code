package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		int[] result = intersection(nums1, nums2);
		for (int n : result) {
			System.out.print(n+" ");
		}
	}
	public static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		for (int num : nums1) {
			set1.add(num);
		}
		for (int num : nums2) {
			set2.add(num);
		}
		set1.retainAll(set2);
		int[] output = new int[set1.size()];
		int index = 0;
		for (int s : set1) {
			output[index++] = s;
		}
		return output;
	}
}
