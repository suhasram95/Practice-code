package com.leetcode;

public class HavingFun {
	public static void main(String[] args) {
		int x = 3;
		fun2(x);
	}
	public static void fun1(int n) {
		if (n > 0) {
			System.out.println(n);
			fun1(n-1);
		}
	}
	public static void fun2(int n) {
		if (n > 0) {
			fun2(n-1);
			System.out.println(n);
		}
	}
}
