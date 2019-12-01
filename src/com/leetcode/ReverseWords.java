package com.leetcode;

public class ReverseWords {
	public static void main(String[] args) {
		String s = "the sky is blue";
		String result = reverseWords(s);
		System.out.println(result);
	}
	public static String reverseWords(String s) {
		if (s.length() == 0 || s == null) {
			return "";
		}
		// split to words by space
		String[] arr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; i--) {
			if (!arr.equals(" ")) {
				sb.append(arr[i]).append(" ");
			}
		}
		return sb.length() == 0 ? " " : sb.substring(0, sb.length()-1);
	}
}
