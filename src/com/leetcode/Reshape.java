package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Reshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {{1,2,3,4,5}, {6,7,8,9,10}};
		int[][] result = reshape(array, 5, 2);
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] reshape(int[][] matrix, int r, int c) {
		int[][] result = new int[r][c];
		if (matrix == null || r * c != matrix.length * matrix[0].length) {
			return matrix;
		}
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				queue.add(matrix[i][j]);
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				result[i][j] = queue.remove();
			}
		}
		return result;
	}
}
