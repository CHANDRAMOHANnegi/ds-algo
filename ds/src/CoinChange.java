
public class CoinChange {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 5, 7 };
		int target = 10;
		System.out.println("combination");
		solveC(arr, target, 0, "");
		System.out.println("permutation");

		solveP(arr, target, 0, "");
	}

	private static void solveP(int[] arr, int target, int vidx, String ans) {

		if (target == 0) {
			System.out.println(ans);
			return;
		}

		if (target < 0) {
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			solveP(arr, target - arr[i], vidx, ans + " " + arr[i]);
			vidx += 1;
		}
	}

	private static void solveC(int[] arr, int target, int vidx, String ans) {

		if (target == 0) {
			System.out.println(ans);
			return;
		}

		if (target < 0) {
			return;
		}

		for (int i = vidx; i < arr.length; i++) {
			solveC(arr, target - arr[i], vidx, ans + " " + arr[i]);
			vidx += 1;
		}
	}
}
