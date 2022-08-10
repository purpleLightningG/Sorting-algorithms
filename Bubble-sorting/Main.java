package bubbleSorting;

public class Main {

	public static void main(String[] args) {

		int b[] = { 66, 72, 8, 6, 63, 55, 1, 2 };
	
	
	BubbleSorting1 a = new BubbleSorting1(b);
	
	a.forwardprint();
	a.sort();
	a.forwardprint();
	
	}

}
