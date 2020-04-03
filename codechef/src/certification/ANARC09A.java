package certification;

import java.util.Scanner;
import java.util.Stack;

//{}}{{}
//{}}{}}
//{}{{{{

public class ANARC09A {

	public static int solve(String str) {
		Stack<Character> st = new Stack<>();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (st.size() > 0) {
				if (c == '}') {
					if (!st.isEmpty() && st.peek() == '{') {
						st.pop();
					} else
						st.push(c);
				} else {
					st.push(c);
				}
			} else {
				st.push(c);
			}
		}
 

		for (int i = 0; i < st.size() - 1;) {
			if (st.elementAt(i) == '{' && st.elementAt(i + 1) == '{') {
				count++;
				i += 2;
			} else if (st.elementAt(i) == '}' && st.elementAt(i + 1) == '{') {
				count += 2;
				i += 2;
			} else {
				count++;
				i += 2;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.next();
			if (str.contains("-")) {
				sc.close();
				return;
			}
			System.out.println(solve(str));
		}
	}
}
