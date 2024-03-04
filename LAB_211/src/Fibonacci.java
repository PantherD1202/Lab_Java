
public class Fibonacci {

//	public static int fibonacciHelper(int term, int low, int high) {
//		if (term < 2) {
//			return high;
//		}
//		System.out.print(high + " ");
//		return fibonacciHelper(term - 1, high, high + low);
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("The 45 sequence fibonacci: ");
//		fibonacciHelper(45, 1, 0);

		int n = 10; // Số phần tử của dãy Fibonacci mà bạn muốn in ra

		long[] fibonacci = new long[n];
		fibonacci[0] = 0;
		fibonacci[1] = 1;

		for (int i = 2; i < n; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}

		System.out.println("Dãy Fibonacci với " + n + " phần tử:");
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci[i] + " ");
		}

	}

}
