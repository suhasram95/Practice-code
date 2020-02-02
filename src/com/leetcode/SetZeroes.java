package com.leetcode;

public class SetZeroes {
	public static void main(String[] args) {
		
	}
	public static void setZeroes(int[][] matrix) {
		boolean firstRowZero = false;
		boolean firstColZero = false;
		
		// set first row and column zero or not 
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				firstRowZero = true;
				break;
			}
		}
		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[0][i] == 0) {
				firstColZero = true;
				break;
			}
		}
		// mark zeros on first row and column
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					// sets the column to zero 
					matrix[0][j] = 0;
					// sets the row to zero
				}
			}
		}
		// use mark to set elements
//		for (int i = 0; )
	}
}
