package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 19;
		System.out.println(isHappy(n));
	}
	public static boolean isHappy(int n) {
		Set<Integer> seen = new HashSet<Integer>();
		while (n != 0 && !seen.contains(n)) {
			n = getNext(n);
			seen.add(n);
		}
		return n==1;
	}
	private static int getNext(int n) {
		int sum = 0;
		while (n != 0) {
			int temp = n%10;
			sum = temp*temp;
			n /= 10;
		}
		return sum;
	}
}
