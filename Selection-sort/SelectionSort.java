package selectionSort;

public class SelectionSort {

	public static void main(String[] args) {

		int a[] = new int[] { 55, 66, 2, 3, 44, 38, 565 };
		selectionSorting(a);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	public static int[] selectionSorting(int[] a) {

		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;

				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;

		}

		return a;
	}

}
