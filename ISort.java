package HDT3;
/**
 * interfaz para los métodos de ordenamiento
 * los métodos de las implementaciones utilizan la descripción de esta interfaz
 * @author Colaborativo
 */
public interface ISort {
    /**
     * método para ordenar los números de un arreglo de menor a mayor
     * @param arr el arreglo de enteros
     * @return el arreglo ya ordenado
     */
    public int[] sort(int[] arr);
}
