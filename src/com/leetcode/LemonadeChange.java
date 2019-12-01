package com.leetcode;

public class LemonadeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bills = {5,5,5,10,20};
		System.out.println(lemonadeChange(bills));
		System.out.println(lemonadeChange(new int[]{5,5,10,10,20}));
		System.out.println(lemonadeChange(new int[] {5,5,10}));
	}

	public static boolean lemonadeChange(int[] bills) {
		int five = 0;
		int ten = 0;
		for (int bill : bills) {
			if (bill == 5) {
				five++;
			} else if (bill == 10) {
				if (five == 0) {
					return false;
				}
				five--;
				ten++;
			} else { // to check if it is a $20 bill
				if (five > 0 && ten > 0) {
					five--;
					ten--;
				} else if (five >= 3) {
					five -= 3;
				} else {
					return false;
				}
			}
		}
		return true;
	}
}
