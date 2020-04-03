package hackerrank;

import java.io.*;
import java.util.*;

public class MatrixRotation {

	static void matrixRotation(List<List<Integer>> matrix, int r) {

		for (List<Integer> list : matrix) {
			for (Integer x : list) {
				System.out.print(x);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) throws IOException {

		List<List<Integer>> matrix = new ArrayList<>();

		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		List<Integer> row2 = new ArrayList<>();
		row2.add(4);
		row2.add(5);
		row2.add(6);
		List<Integer> row3 = new ArrayList<>();
		row3.add(7);
		row3.add(8);
		row3.add(9);

		matrix.add(row1);
		matrix.add(row2);
		matrix.add(row3);

		matrixRotation(matrix, 3);

	}
}
