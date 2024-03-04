import java.util.Scanner;

public class SortOneArray {
	private static Scanner sc = new Scanner(System.in);

	public static int checkInputInteger() {
		while (true) {
			try {
				int result = Integer.parseInt(sc.nextLine().trim());
				return result;

			} catch (NumberFormatException e) {
				System.out.println("Please input number.");
				System.out.print("Enter again: ");
			}
		}
	}

	// check user input out range of menu
	public static int checkInputIntLimit(int min, int max) {
		while (true) {
			try {
				int result = Integer.parseInt(sc.nextLine().trim());
				if (result < min || result > max) {
					throw new NumberFormatException();
				}
				return result;

			} catch (NumberFormatException e) {
				System.out.println("Please input in range [" + min + "," + max + "]");
				System.out.print("Enter again: ");
			}
		}
	}

	public static int inputSizeOfArray() {
		System.out.println("----- Input Element -----");
		System.out.println("Input Length Of Array");
		System.out.print("Enter Number: ");

		while (true) {
			try {
				int result = Integer.parseInt(sc.nextLine().trim());
				if (result <= 0) {
					throw new NumberFormatException();
				}
				return result;
			} catch (NumberFormatException e) {
				System.out.println("Please input number and number greater than zero");
				System.out.print("Enter number: ");
			}
		}
	}

	public static int[] inputValueOfArray() {
		int n = inputSizeOfArray();
		int[] a = new int[n];
		for (int i = 0; i <= n - 1; i++) {
			int num = i + 1;
			System.out.print("Enter number " + num + ": ");
			a[i] = checkInputInteger();
		}
		return a;
	}

	// sort array ascending by bubble sort
	private static void sortArrayAscending(int[] a) {
		int len = a.length;
		if (len == 0) {
			System.err.println("List empty.");
		}
		for (int i = 0; i < len - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < len; j++) {
				if (a[j] < a[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = a[minIndex];
				a[minIndex] = a[i];
				a[i] = temp;
			}
		}
		System.out.println();
		System.out.println("----- Ascending -----");
		for (int i = 0; i < a.length; i++) {
			if (i == a.length - 1) {
				System.out.println("[" + a[i] + "]");
				break;
			}
			System.out.print("[" + a[i] + "]->");
		}
		System.out.println("");
	}

	// sort array descending by bubble sort
	public static void sortArrayDescending(int[] a) {
		int len = a.length;
		if (len == 0) {
			System.out.println("List empty.");
		}
		for (int i = 0; i < len - 1; i++) {
			int maxIndex = i;
			for (int j = i + 1; j < len; j++) {
				if (a[j] > a[maxIndex]) {
					maxIndex = j;
				}
			}
			if (maxIndex != i) {
				int temp = a[maxIndex];
				a[maxIndex] = a[i];
				a[i] = temp;
			}
		}
		System.out.println();
		System.out.println("----- Descending -----");
		for (int i = 0; i < a.length; i++) {
			if (i == a.length - 1) {
				System.out.println("[" + a[i] + "]");
				break;
			}
			System.out.print("[" + a[i] + "]<-");
		}
		System.out.println();

	}

	private static int menu() {
		System.out.println("========= Bubble Sort program =========");
		System.out.println("1. Input Element");
		System.out.println("2. Sort Ascending");
		System.out.println("3. Sort Descending");
		System.out.println("4. Exits.");
		System.out.println("Enter your one option: ");
		int choice = checkInputIntLimit(1, 4);
		return choice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[0];
		while (true) {
			int choice = menu();
			switch (choice) {
			case 1:
				a = inputValueOfArray();
				break;
			case 2:
				sortArrayAscending(a);
				break;
			case 3:
				sortArrayDescending(a);
				break;
			case 4:
				System.err.println("Exited!");
				return;
			}
		}
	}

}
