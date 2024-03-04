
public class FindMaxMinElementOfArray {
	private static int findMaxElementOfArray(int[] a) {
		int max = a[0];
		for (int num : a) {
			if (num > max) {
				max = num;
			}
		}

		return max;
	}

	private static int findMinElementOfArray(int[] arr) {
		int min = arr[0];
		for (int num : arr) {
			if (num < min) {
				min = num;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mark = { 10, 20, 100, 130, 200, 250, 300 };

		int findMax = findMaxElementOfArray(mark);
		int findMin = findMinElementOfArray(mark);
//		System.out.println("Max element of array: " + findMax);
//		System.out.println("Min element of array: " + findMin);
		// variable declaration
		int n1 = 5, n2 = 10, max;

		System.out.println("First num: " + n1);
		System.out.println("Second num: " + n2);

		// Largest among n1 and n2
		max = (n1 > n2) ? n1 : n2;

		// Print the largest number
		System.out.println("Maximum is = " + max);

	}

}
