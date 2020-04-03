package certification;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Sptar {

	public static void reorder(int[] arr) {
		int mobile = 1;
		Stack<Integer> temp = new Stack<Integer>();
		for (int i = 0; i < arr.length;) {
			if (arr[i] == mobile) {
				mobile++;
				i++;
			} else {
				if (!temp.isEmpty() && temp.peek() == mobile) {
					mobile++;
					temp.pop();
				} else {
					temp.push(arr[i]);
					i++;
				}
			}
		}

		while (temp.size() > 0) {
			if (temp.peek() == mobile) {
				mobile++;
				temp.pop();
			} else {
				System.out.println("no");
				return;
			}
		}
		System.out.println("yes");
		return;
	}

	public static void main(String[] args) throws IOException {

//		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
//		while (true) {
//			int noOfMobiles;
//			noOfMobiles = Integer.parseInt(bi.readLine());
//			if (noOfMobiles == 0) {
//				bi.close();
//				return;
//			}
//			int arr[] = new int[noOfMobiles];
//			String[] strNums;
//			strNums = bi.readLine().split(" ");
//			for (int i = 0; i < strNums.length; i++) {
//				arr[i] = Integer.parseInt(strNums[i]);
//			}
//			reorder(arr);
//		}

//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			int noOfMobiles;
//			noOfMobiles = sc.nextInt();
//			if (noOfMobiles == 0) {
//				sc.close();
//				return;
//			}
//			int arr[] = new int[noOfMobiles];
//			 
//			for (int i = 0; i < noOfMobiles; i++) {
//				arr[i] = sc.nextInt();
//			}
//			reorder(arr);
//		}
	}
}
