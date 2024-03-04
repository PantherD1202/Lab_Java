import java.util.Random;
import java.util.Scanner;

public class LinerSearch {
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

	private static int[] inputIndexArray(int n) {
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

	public int linerSearch(int[] a, int key) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = inputValueOfArray();
		int search = inputSearchValue();
		int[] a = inputIndexArray(n);
		LinerSearch ls = new LinerSearch();
		System.out.println("The array: ");
		printArray(a);
		int foundIndex = ls.linerSearch(a, search);
		System.out.println("\nFound " + search + " at index: " + foundIndex);
	}

}
