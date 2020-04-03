package hackerrank;

import java.io.*;

public class ClimbingLeaderboard {
 
	static int[] climbingLeaderboard(int[] scores, int[] alice) {
		for (int i = 0; i < alice.length; i++) {
			int position = 1;
			for (int j = 0; j <= (scores.length); j++) {
				if (j < scores.length - 1 && scores[j] == scores[j + 1]) {
					continue;
				}
				if (j == scores.length) {
					alice[i] = position;
				} else if (scores[j] <= alice[i]) {
					alice[i] = position;
					break;
				} else if (scores[j] > alice[i]) {
					position++;
				}
			}
		}
		return alice;
	}

	public static void main(String[] args) throws IOException {

		int[] scores = { 100, 90, 90, 80, 75, 60 };
		int[] scores2 = { 100, 90, 80, 75, 60 };
		int[] alice = { 50, 65, 77, 90, 102 };
		int[] result = climbingLeaderboard(scores, alice);
		for (int i : result) {
			System.out.println(i);
		}
	}
}
