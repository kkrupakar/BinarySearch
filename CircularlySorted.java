package BinarySearch;

public class CircularlySorted<T extends Comparable<T>> {

	public long pivot(T[] data) {
		return helper(data, 0, data.length - 1);
	}

	public int search(T[] data, T x) {
		return helper(data, x, 0, data.length - 1);
	}

	private long helper(T[] data, int start, int end) {
		int mid = (start + end ) / 2;
		System.out.println("start : "+start+", end : "+end+", mid : "+mid);
		if (end < start) {
			return 0;
		} else if (start == end) {
			return start;
		} else if (mid < end && data[mid + 1].compareTo(data[mid]) < 0) {
			return mid + 1;
		} else if (mid > start && data[mid].compareTo(data[mid - 1]) < 0) {
			return mid;
		} else if (data[end].compareTo(data[mid]) > 0) {
			return helper(data, start, mid - 1);
		} else {
			return helper(data, mid + 1, end);
		}
	}

	
	private int helper(T[] data, T x, int start, int end) {

		if (start > end) {
			return -1;
		}

		int mid = (start + end) / 2;

		if (x.compareTo(data[mid]) == 0) {
			return mid;
		} else if (x.compareTo(data[mid]) < 0) {
			if (data[start].compareTo(data[mid]) <= 0 && x.compareTo(data[start]) > 0) {
				return helper(data, x, mid, end);
			} else {
				return helper(data, x, start, mid);
			}
		} else {
			if (data[mid].compareTo(data[end]) <= 0 && x.compareTo(data[end]) > 0) {
				return helper(data, x, start, mid);
			} else {
				return helper(data, x, mid, end);
			}
		}

	}

}
