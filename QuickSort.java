package HDT3;
/**
 * Clase que implementa un ordenamiento quick sort
 * @author SaintPage, colaborativo
 */
public class QuickSort implements ISort {

    @Override
    public int[] sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    /**
     * Método que intercambia dos número de un arreglo
     * @param arr el arreglo de enteros
     * @param i el indice de un número
     * @param j el indice del otro
     */
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    /**
     * método para la partición del quicksort
     * @param arr el arreglo de números
     * @param low el indice inicial (0)
     * @param high el indice final (largo-1)
     * @return el entero de la partición
     */
    int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
}