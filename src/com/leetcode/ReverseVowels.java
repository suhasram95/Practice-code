package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReverseVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		System.out.println(reverseVowels(s));
	}
	public static String reverseVowels(String s) {
		List<Character> vowels = new ArrayList<Character>();
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		int i = 0;
		int j = s.length()-1;
		
		char[] arr = s.toCharArray();
		
		while (i < j) {
			if (!vowels.contains(arr[i])) {
				i++;
				continue;
			}
			if (!vowels.contains(arr[j])) {
				j--;
				continue;
			}
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return new String(arr);
	}
}
