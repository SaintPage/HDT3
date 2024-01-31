package HDT3;
/**
 * Clase que implementa un ordenamiento bubble sort
 * @author SaintPage, colaborativo
 */
public class BubbleSort implements ISort{
    @Override
    public int [] sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j +1]){
                    int temp = arr[j];
                    arr [j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}