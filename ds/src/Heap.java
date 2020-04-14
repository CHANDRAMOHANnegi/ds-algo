import java.util.ArrayList;

public class Heap {

	public static void main(String[] args) {

	}

	public static class priorityQueue {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		boolean isMax = true;

		priorityQueue(boolean isMAx) {
			this.isMax = isMAx;
		}

		priorityQueue(int[] arr1, boolean isMAx) {
			this.isMax = isMAx;

			for (int i = 0; i < arr1.length; i++) {
				arr.add(arr1[i]);
			}
			for (int i = arr.size() - 1; i >= 0; i--) {
				downheapify(i);
			}

		}

		void upheapify(int ci) {
			int pi = ci - 1 >> 1;
			if (pi >= 0 && compareTo((int) arr.get(ci), (int) arr.get(pi)) > 0) {
				swap(pi, ci);
				upheapify(pi);
			}

		}

		void downheapify(int idx) {
			int maxidx = idx;
			int lci = 2 * idx + 1;
			int rci = 2 * idx + 1;

			if (lci < arr.size() && compareTo((int) arr.get(lci), (int) arr.get(maxidx)) > 0) {
				maxidx = lci;
			}
			if (rci < arr.size() && compareTo((int) arr.get(rci), (int) arr.get(maxidx)) > 0) {
				maxidx = rci;
			}

			if (maxidx != idx) {
				swap(maxidx, idx);
				downheapify(maxidx);
			}

		}

		private void swap(int x, int y) {
			Integer val1 = arr.get(x);
			Integer val2 = arr.get(y);

			arr.set(x, val2);
			arr.set(y, val1);

		}

		int compareTo(Integer val1, Integer val2) {
			if (isMax) {
				return val1 - val2;
			} else {
				return val2 - val1;
			}
		}

	}

}
