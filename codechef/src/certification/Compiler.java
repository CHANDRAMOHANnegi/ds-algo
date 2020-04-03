package certification;

import java.util.Scanner;
import java.util.Stack;

public class Compiler {
	private static int solve(String str) {
		int count = 0;
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (st.size() > 0) {
				if (c == '>') {
					st.pop();
					count += 2;
				} else if (c == '<')
					st.push((char) (count + '0'));
			} else {
				if (c == '>')
					return count;
				else
					st.push((char) (count + '0'));
			}
		}
		if (st.size() > 0) {
			return (int) ((st.elementAt(0) - '0'));
		}
		return count;
	}

	public static void main(String[] args) {

 
		Scanner sc = new Scanner(System.in);
		int noOfCases;
		noOfCases = sc.nextInt();
		sc.nextLine();
		while (noOfCases > 0) {
			String str = sc.nextLine();
			System.out.println(solve(str));
			noOfCases--;
		}
		if (noOfCases == 0) {
			sc.close();
		}
	}
}
