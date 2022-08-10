package bubbleSorting;

public class BubbleSorting {

	public static void main(String[] args) {

		int a[] = new int[] { 55, 66, 2, 3, 44, 38, 565 };
		bubbleSorting(a);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	public static int[] bubbleSorting(int[] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {

					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		return a;
	}

}
