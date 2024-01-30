package HDT3;

public class MergeSort implements ISort {
    private static int LEFT = -1;
    private static int RIGHT = -1;

    private int[] sort(int[] arr, int l, int r){
        LEFT = l;
        RIGHT = r;
        arr = sort(arr);
        return arr;
    }

    @Override
    public int[] sort(int[] arr) {
        int left;
        int right;
        if(LEFT == -1){
            left =0;
            right = arr.length - 1;
        }
        else{
            left = LEFT;
            right = RIGHT;
        }
        if (left < right) {
 
            int middle = left + (right - left) / 2;
 
            arr = sort(arr, left, middle);
            arr = sort(arr, middle + 1, right);
 
            merge(arr, left, middle, right);
        }
        LEFT = -1;
        RIGHT = -1;
        return arr;
        
    }

    void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
 
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
 
        int i = 0, j = 0;
 
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
     
 
}
