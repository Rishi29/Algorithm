package binary_search;

public class BinarySearchRecurssive {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 5, 6, 7, 8 };
		int x = 5;
		int length = arr.length;
		int start = 0;
		int end = length - 1;

		boolean result = binarySearchRecurssive(arr, x, start, end);
		System.out.println("Element found " + result);

	}

	private static boolean binarySearchRecurssive(int[] arr, int x, int start, int end) {

		if (start > end) {
			return false;
		}

		int mid = start + (end - start) / 2;

		if (x == arr[mid]) {
			System.out.println("Element found at index " + mid);
			return true;
		} else if (x < arr[mid]) {

			binarySearchRecurssive(arr, x, start, mid - 1);
		} else if (x > arr[mid]) {
			binarySearchRecurssive(arr, x, mid + 1, end);
		}

		return false;

	}

}
