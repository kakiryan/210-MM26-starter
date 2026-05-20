package lec05;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {8, 3, 12, 1, 6, 10, 5};
        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /*
     Partition using FIRST element as pivot.
     Maintains the invariant:

     arr[low + 1 ... i] < pivot
     arr[i + 1 ... j - 1] >= pivot
     arr[j ... high] unchecked
    */
    static int partition(int[] arr, int low, int high) {

        int pivot = arr[low];
        int i = low;

        for (int j = low + 1; j <= high; j++) {

            // If current element belongs
            // in the "smaller than pivot" region
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Put pivot into final position
        swap(arr, low, i);

        return i;
    }

    static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}