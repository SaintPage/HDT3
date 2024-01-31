package HDT3;
import java.util.Arrays;
/**
 * Clase que implementa un ordenamiento quick sort
 * @author SaintPage, colaborativo
 */
public class RadixSort implements ISort {

    @Override
    public int[] sort(int[] arr) {
        int n = arr.length;
        int m = getMax(arr, n);

        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);

        return arr;
    }
    /**
     * implementa el algoritmo de quick sort usando un número exponencial en el arreglo
     * @param arr el arreglo de enteros
     * @param n el total de enteros en el arreglo
     * @param exp número exponencial
     */
    private void countSort(int arr[], int n, int exp) {
        int output[] = new int[n];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        for (i = 0; i < n; i++) 
            count[(arr[i] / exp) % 10]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }
    /**
     * método para obtener el número mayor de un arreglo
     * @param arr el arreglo de enteros
     * @param n el número total de enteros
     * @return el entero mayor
     */
    private int getMax(int arr[], int n) {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }
    /**
     * Método para imprimir los enteros de un arreglo
     * @param arr el arreglo de enteros
     * @param n el total de enteros en el arreglo
     */
    public static void print(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
