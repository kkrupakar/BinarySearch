package BinarySearch;

public class Execute {

	public static void main(String args[]) {
		/*
		 * BinarySearch<Integer> bs = new BinarySearch<Integer>(); Integer[] arr =
		 * {3,7,9,12,17,25,27,35,41};
		 * System.out.println("is 12 present? "+bs.search(arr, 12));
		 * System.out.println("is 3 present? "+bs.search(arr, 3));
		 * System.out.println("is 41 present? "+bs.search(arr, 41));
		 */

		FirstOrLastOccurance<Integer> fo = new FirstOrLastOccurance<Integer>(true);
		FirstOrLastOccurance<Integer> lo = new FirstOrLastOccurance<Integer>(false);
		Integer[] arr = { 3, 7, 9, 12, 12, 12, 12, 17, 25, 27, 35, 41 };

		System.out.println("first occurance index of 12 : " + fo.search(arr, 12));
		System.out.println("last occurance index of 12 : " + lo.search(arr, 12));
	}
}
