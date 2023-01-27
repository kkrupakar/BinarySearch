package BinarySearch;

public class BinarySearch<T extends Comparable<T>> {

	public boolean search(T[] data, T x) {
		return helper(data, x, 0, data.length);
	}

	private boolean helper(T[] data, T x, int start, int end) {
		
		if (start >= end) {
			return false;
		}
		
		int mid = (start + end) / 2;
		
		if (data[mid].compareTo(x) > 0) {
			return helper(data, x, start, mid);
		} else if (data[mid].compareTo(x) < 0) {
			return helper(data, x, mid + 1, end);
		} else {
			return true;
		}
	}
}
