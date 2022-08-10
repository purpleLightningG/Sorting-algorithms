/**
 * 
 */
package merge;

/**
 * @author Shahriar_Hossain
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,66,33,1,3,55};

        MergeSort sorter = new MergeSort();

        sorter.sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +" ");
        }

	}

}
