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

		/*
		 * FirstOrLastOccurance<Integer> fo = new FirstOrLastOccurance<Integer>(true);
		 * FirstOrLastOccurance<Integer> lo = new FirstOrLastOccurance<Integer>(false);
		 * Integer[] arr = { 3, 7, 9, 12, 12, 12, 12, 17, 25, 27, 35, 41 };
		 * 
		 * System.out.println("first occurance index of 12 : " + fo.search(arr, 12));
		 * System.out.println("last occurance index of 12 : " + lo.search(arr, 12));
		 * System.out.println("number of occurances of 12 : "+ ((lo.search(arr, 12) -
		 * fo.search(arr, 12))+1));
		 */
		
		CircularlySorted<Integer> cs = new CircularlySorted<Integer>();
		Integer[] data = {21,45,67,12,17,23};
		
		System.out.println("pivot of circular sorted array / Rotation count : "+cs.pivot(data));
		System.out.println("search index of 45 in circular sorted array : "+cs.search(data, 45));
		
	}
}
