package binary_search;

public class BinarySearchIterative {
	public static void main(String[] args) {

		int arr[] = { 2, 4, 5, 6, 7, 9 };
		int x = 7;

		boolean result = binarySearchIterative(arr, x);
		System.out.println("Element found in the array " + result);

	}

	private static boolean binarySearchIterative(int[] arr, int x) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (x == arr[mid]) {
				System.out.println("Element found at index " + mid);
				return true;

			} else if (x > arr[mid]) {

				start = mid + 1;
			} else if (x < arr[mid]) {
				end = mid - 1;
			}
		}

		return false;
	}

}
