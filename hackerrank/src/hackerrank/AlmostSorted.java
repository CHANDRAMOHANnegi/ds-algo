package hackerrank;

import java.util.*;

public class AlmostSorted {
	static void almostSorted(int[] arr) {

		boolean swap = false;
		boolean reverse = false;
		boolean state = false;
		boolean alreadySorted = true;
		int start = 0;
		int end = 0;
		int b[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
			b[i] = arr[i];

		if (arr.length == 2) {
			if (arr[0] > arr[1]) {
				alreadySorted = false;
				start = 0;
				end = 1;
			}
			swap = true;
		} else {
			Arrays.sort(b);
			outer: for (int i = 0; i < b.length; i++) {
				inner: for (int j = i; j < arr.length; j++) {
					if (b[i] == arr[j]) {
						if (state) {
							end = j;
							break outer;
						} else {
							break inner;
						}
					} else {
						alreadySorted = false;
						if (!state) {
							start = j;
							state = true;
						}
					}
				}
			}

			if ((end - start + 1) == 2) {
				if (start > 0) {
					if (arr[end] > arr[start - 1])
						swap = true;
				}
				if (end < arr.length) {
					if (arr[start] < arr[end])
						swap = true;
				}
			} else {
				if (arr[start + 1] > arr[start + 2])
					reverse = true;
				else
					swap = true;
			}
		}
		if (alreadySorted)
			System.out.println("yes");
		else {
			if (swap || reverse)
				System.out.println("yes");
			System.out.println(
					(swap || reverse ? (reverse ? "reverse" : "swap") + " " + ((start + 1) + " " + (end + 1)) : "no"));
		}
	}

	public static void main(String[] args) {

		int[] arr = { 43, 65, 1, 98, 99, 101 };

		almostSorted(arr);

	}
}
