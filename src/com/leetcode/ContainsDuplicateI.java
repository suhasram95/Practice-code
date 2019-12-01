package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateI {
	public static void main(String[] args) {
		int[] nums = {1,1,1,3,3,4,3,2,4,2};
		System.out.println(containsDuplicate(nums));
	}
	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int n : nums) {
			if (set.contains(n)) {
				return true;
			}
			else {
				set.add(n);
			}
		}
		return false;
	}
}
