package geeksForGeeks;

/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;

public class Solution {
	static public ArrayList<Integer> removeduplicates(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
			} else {
				list.add(arr[i]);
			}
		}
		return list;
	}

	static int[] climbingLeaderboard(int[] score, int[] alice) {
		ArrayList<Integer> list = removeduplicates(score);
		Integer[] scores = list.toArray(new Integer[list.size()]); 
 		int[] result = new int[alice.length];
		int i = 0;
		while (i < alice.length) {
  				int position=binarySearch(scores, 0, scores.length - 1, alice[i]);
			result[i]=position+1;
			i++;
		}
		return result;
	}

	static public int binarySearch(Integer arr[], int start, int end, int n) {

//		if(n<arr[end]) {
//			return start+arr.length;
//		}
//		if(n>arr[start]) {
//			return start;
//		}
		if (end >= start) {
			int mid = start + ((end - start) / 2);
			if (arr[mid] == n)
				return mid;
			else if (arr[mid] < n) {
				if(arr[mid-1]>n) {
					return mid-1;
				}
				return binarySearch(arr, start, mid - 1, n);
			} else {
				if(arr[mid+1]<n) {
					return mid+1;
				}
				return binarySearch(arr, mid + 1, end, n);
			}
		}
		return -1;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int[] scores = { 100, 100, 50, 40, 40, 20, 10 };
		int[] alice = new int[] { 5, 25, 50, 120 };

		int[] result = climbingLeaderboard(scores, alice);

		for (int i = 0; i < result.length; i++) {
			System.out.println("    -- "+result[i]);
		}
		scanner.close();
	}
}
