import java.util.Random;
import java.util.Scanner;

public class AlgorithmBinarySearch {

	private static Scanner sc = new Scanner(System.in);

	private static int checkInput() {
		while (true) {
			try {
				int result = Integer.parseInt(sc.nextLine().trim());
				return result;

			} catch (NumberFormatException e) {
				System.out.println("Please input integer");
				System.out.print("Enter again: ");
			}
		}
	}

	private static int inputValueOfArray() {
		System.out.println("Enter number of array: ");
		int n = checkInput();
		return n;
	}

	private static int inputSearchValue() {
		System.out.println("Enter search value: ");
		int search = checkInput();
		return search;
	}

	// allow user input value of array
	private static int[] inputValueOfArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter a[" + i + "]: ");
			a[i] = checkInput();
		}
		return a;
	}

	private static int[] randomValueOfArray(int n, int min, int max) {
		int[] a = new int[n];
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			int randomNumber = random.nextInt(max - min + 1) + min;
			a[i] = randomNumber;
		}
		return a;
	}

	void AlgorithmBubbleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println();
	}

	int binarySearch(int[] a, int value, int left, int right) {
		if (left > right) {
			return -1;
		}
		int mid = (left + right) / 2;
		if (a[mid] == value) {
			return mid;
		} else if (a[mid] > value) {
			return binarySearch(a, value, left, mid - 1);
		} else {
			return binarySearch(a, value, mid + 1, right);
		}
	}

	public static void printArray(int[] a) {
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i < a.length - 1) {
				System.out.print(", ");
			}

		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = inputValueOfArray();
		int search = inputSearchValue();
		// int[] a = randomValueOfArray(n, 1, 100);
		int[] a = inputValueOfArray(n);
		AlgorithmBinarySearch searcher = new AlgorithmBinarySearch();
		searcher.AlgorithmBubbleSort(a);
		System.out.print("Sorted array: ");
		searcher.printArray(a);

		int foundIndex = searcher.binarySearch(a, search, 0, n - 1);
		System.out.println("\nFound " + search + " at index: " + foundIndex);
	}

}
