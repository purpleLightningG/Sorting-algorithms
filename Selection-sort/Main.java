package selectionSort;

public class Main {

	public static void main(String[] args) {

		int b[] = { 66, 99, 8, 6, 63, 55, 1, 2 };
	
	
	SelectionSort1 a = new SelectionSort1(b);
	
	a.forwardprint();
	a.sort();
	a.forwardprint();
	
	}

}
