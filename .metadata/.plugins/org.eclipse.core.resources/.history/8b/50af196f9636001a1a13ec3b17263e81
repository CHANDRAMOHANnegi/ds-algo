package hackerrank;

public class Factorial {

	static void factorial(int n) {
		int res[] = new int[500];

		res[0] = 1;
		int res_size = 1;

		for (int x = 2; x <= n; x++) {
			res_size = multiply(x, res, res_size);
		}

		System.out.println("Factorial of given number is ");
		for (int i = res_size - 1; i >= 0; i--)
			System.out.print(res[i]);
	}

	static int multiply(int x, int res[], int res_size) {

		int carry = 0;

		for (int i = 0; i < res_size; i++) {
//			int prod = res[i] * x + carry;
//			res[i] = prod % 10;
//			carry = prod / 10;
		}

		while (carry != 0) {
			res[res_size] = carry % 10;

			res_size++;
			carry /= 10;
		}

		return res_size;
	}

	public static void main(String args[]) {
		factorial(100);

//		System.out.println(320%10);
//		System.out.println(-321%10);	
//		System.out.println(6%10);	
//		System.out.println(10%6);	
//		System.out.println(-5%10);	
//		System.out.println(37%6);	
//		System.out.println(-7%6);
//		System.out.println(-3%2);
	}
}