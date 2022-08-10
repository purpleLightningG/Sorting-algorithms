package insertionSort;

public class InsertionSort {

	public static void main(String[] args) {

		int a[] = selection(new int[] { 5, 9, 99, 63, 66, 653, 25, 20, 101 });
	
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}


	public static int [] selection(int a[]) {
	
		for(int i=1;i<a.length;i++) {
			int element = a[i]; // the element that we intend to bring in the left side of the sorted array
			int j = i-1; // the last index of the sorted portion
			
			while(j>=0 && a[j]>element) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=element;
		}
		return a;
	}

}
