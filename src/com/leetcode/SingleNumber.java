package com.leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SingleNumber {
	public static void main(String[] args) {
		int[] arr = {4,1,2,1,2};
		System.out.println(singleNumber(arr));
	}
	public static int singleNumber(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int n : nums) {
			if (set.contains(n)) {
				set.remove(n);
			}
			else {
				set.add(n);
			}
		}
		Iterator<Integer> i = set.iterator();
		return i.next();
	}
}
