/**
 * 
 */
package merge;

/**
 * @author Shahriar_Hossain
 *
 */
public class MergeSort {

	public static void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    public static void sort(int[] a, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;

        sort(a, start, mid); // left portion of array
        sort(a, mid + 1, end); // right portion of array

        merge(a, start, mid, end); //merging the sorted array

    }

    public static void merge(int a[], int start, int mid, int end) {

        int temp[] = new int[end - start + 1];

        int leftIndex = start; // index counter for left portion of the array
        int rightIndex = mid + 1;// index counter for right portion of the array

        int index = 0;

        while (leftIndex <= mid && rightIndex <= end) {
            if (a[leftIndex] <= a[rightIndex]) {
                temp[index] = a[leftIndex];
                leftIndex++;

            } else {
                temp[index] = a[rightIndex];
                rightIndex++;
            }
            index++;
        }

        /*Considering both the left and right side of the array is sorted
         after the completiton of loop*/
        if (leftIndex <= mid) {
            while (leftIndex <= mid) {
                temp[index] = a[leftIndex];
                leftIndex++;
                index++;
            }
        } else if (rightIndex <= end) {
            while (rightIndex <= end) {
                temp[index] = a[rightIndex];
                rightIndex++;
                index++;

            }
        }

        //Now copying the temp array to the original array--> a 
        for (int i = 0; i < a.length; i++) {
            a[start + i] = temp[i];
        }

    }
}
