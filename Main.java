package HDT3;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        //QuickSort:
        // ISort sorter = new QuickSort();
        // int[] arr = {10, 7, 8, 9, 1, 5};
        // arr = sorter.sort(arr);
        // System.out.println("Sorted array: " + Arrays.toString(arr));

        //MergeSort:
        // var arr = new int[] {3, 9, 10, 1, 8, 7, 5, 2};
        // ISort ordenar = new MergeSort();
        // var array = ordenar.sort(arr);
        // System.out.println("El resultado es:");
        // for (int element: array) {
        //     System.out.print(element + " ");
    

        
        // RadixSort:
        // int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        // int n = arr.length;
        // RadixSort rs = new RadixSort();
        // arr = rs.sort(arr);
        // RadixSort.print(arr, n);
         
        

        //GnomeSort:
        int arr[] = { 34, 2, 10, -9 };
        GnomeSort gs = new GnomeSort();
        arr = gs.sort(arr);
        System.out.println(Arrays.toString(arr));

        
    }

}