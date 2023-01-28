package BinarySearch;

public class CircularlySorted<T extends Comparable<T>> {

	public long pivot(T[] data) {
		return helper(data, 0, data.length);
	}

	public int search(T[] data, T x) {
		return helper(data, x, 0, data.length-1);
	}

	private long helper(T[] data, int start, int end) {
		if ((end - start) < 3) {
			return -1;
		}
		
		int mid = (start + end) / 2;

		if (data[mid - 1].compareTo(data[mid]) > 0 && data[mid + 1].compareTo(data[mid]) > 0) {
			return mid;
		}

		if (data[mid - 1].compareTo(data[mid]) > 0 && data[mid + 1].compareTo(data[mid]) < 0) {
			return helper(data, mid+1, end);
		}

		if (data[mid - 1].compareTo(data[mid]) <= 0 && data[mid + 1].compareTo(data[mid]) > 0) {
			return helper(data, start, mid-1);
		}
		return -1;
	}

	private int helper(T[] data, T x, int start, int end) {
		
		if (start > end) {
			return -1;
		}

		int mid = (start + end ) / 2;
	
		if (x.compareTo(data[mid]) == 0) {
			return mid;
		}else if(x.compareTo(data[mid]) < 0) {
			if(data[start].compareTo(data[mid]) <= 0 && x.compareTo(data[start]) <= 0) {
				return helper(data, x, mid, end);
			}else {
				return helper(data, x, start, mid);
			}
		}else {
			if(data[mid].compareTo(data[end]) <= 0 && x.compareTo(data[end]) >= 0) {
				return helper(data,x,start,mid);
			}else {
				return helper(data,x,mid,end);
			}
		}

	}

	
}
