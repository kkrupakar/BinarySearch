package BinarySearch;

public class FirstOrLastOccurance<T extends Comparable<T>> {

	boolean firstOccurance;

	public FirstOrLastOccurance(boolean firstOne) {
		this.firstOccurance = firstOne;
	}

	public int search(T[] data, T x) {
		return helper(data, x, 0, data.length);
	}

	private int helper(T[] data, T x, int start, int end) {
		if (start > end) {
			return -1;
		}

		int mid = (start + end) / 2;
		if (x.compareTo(data[mid]) > 0) {
			return helper(data, x, mid + 1, end);
		} else if (x.compareTo(data[mid]) < 0) {
			return helper(data, x, start, mid);
		} else {
			if (firstOccurance && data[mid - 1].compareTo(x) == 0) {
				return helper(data, x, start, mid - 1);
			}

			if (!firstOccurance && data[mid + 1].compareTo(x) == 0) {
				return helper(data, x, mid + 1, end);
			}
			return mid;
		}
	}

}
