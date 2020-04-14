package dynamicprogramming;

//[2,3,1,1,4]
//5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0
//2, 2, 2, 1, 1, -, 2, 2, 1, 1, -, 0

public class JumpGameII {

	public static int solven(int nums[]) {
		int jump = 0;
		int idx = 0;
		for (int i = idx; i < idx + nums.length - 1; i++) {

		}

		return jump;
	}

	public static int solveR(int nums[], int idx) {

		if (idx == nums.length - 1) {
			System.out.println(idx);
			return 0;
		}
		int min = Integer.MAX_VALUE;
		int res = 0;
		for (int i = 1; i <= nums[idx]; i++) {
			if (idx + i < nums.length) {
				res = solveR(nums, idx + i);
				if (res < min) {
					min = res;
				}
			}
		}
		return res + 1;
	}

	public static int solveG(int nums[], int idx) {

		if (idx == nums.length - 1) {
			System.out.println(idx);
			return 0;
		}

		int res = 0;
		for (int i = 1; i <= nums[idx]; i++) {
			if (idx + i < nums.length) {

			}
		}
		return res + 1;
	}

	public static int solveT(int nums[]) {
		nums[nums.length - 1] = 0;
		for (int i = nums.length - 2; i >= 0; i--) {
			int min = Integer.MAX_VALUE;
			if (nums[i] == 0) {
				nums[i] = Integer.MAX_VALUE;
				continue;
			}
			for (int j = i + 1; j <= i + nums[i]; j++) {
				if (j <= nums.length - 1 && nums[j] <= min) {
					min = nums[j];
				}
			}
			if (min != Integer.MAX_VALUE)
				nums[i] = min + 1;
			else
				nums[i] = min;

		}
		return nums[0];
	}

	public static int solve(int nums[]) {

		int ans = solveR(nums, 0);
//				System.out.println();
//				for (int i : nums) {
//					System.out.println(i);
//				}
//				System.out.println();
		return ans;
	}

	public static void main(String[] args) {
		int nums1[] = new int[] { 2, 3, 1, 1, 4 };
		int nums2[] = new int[] { 3, 0, 0, 0 };
		int nums3[] = new int[] { 5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0 };

//		System.out.println(Integer.MAX_VALUE+1);

//		System.out.println(solve(nums3));
		System.out.println(solveT(nums1));
	}
}
