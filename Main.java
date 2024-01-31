package HDT3;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 * Programa para realizar algoritmos de ordenamiento
 * @author SaintPage Ultimate-Truth-Seeker
 */
public class Main{
    public static void main(String[] args) {

        int[] list;
        

        //QuickSort:
        ISort sorter = new QuickSort();
        list = randomList(3000);
        list = sorter.sort(list);
        writeFile(list, "quick.txt");
        list = sorter.sort(list);
        // System.out.println("Sorted array: " + Arrays.toString(arr));

        //MergeSort:
        // var arr = new int[] {3, 9, 10, 1, 8, 7, 5, 2};
        ISort ordenar = new MergeSort();
        list = ordenar.sort(list);
        writeFile(list, "merge.txt");
        list = ordenar.sort(list);
        // System.out.println("El resultado es:");
        // for (int element: array) {
        //     System.out.print(element + " ");
    

        
        // RadixSort:
        // int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        // int n = arr.length;
        RadixSort rs = new RadixSort();
        list = randomList(3000);
        list = rs.sort(list);
        writeFile(list, "radix.txt");
        list = rs.sort(list);
        // RadixSort.print(arr, n);
         
        

        //GnomeSort:
        //int arr[] = { 34, 2, 10, -9 };
        GnomeSort gs = new GnomeSort();
        list = randomList(3000);
        list = gs.sort(list);
        writeFile(list, "gnome.txt");
        list = gs.sort(list);
        //System.out.println(Arrays.toString(arr));

        

    }

    public static int[] randomList(int n) {
        Random r = new Random();
        int[] list = new int[n];
        for (int i = 0; i <n; i++) {
            list[i] = r.nextInt(3000) +1;
        }
        return list;
    }

    /**
     * escribe en un archivo los enteros de un arreglo separados por espacios
     * @param list el arreglo con los enteros
     * @param file nombre del archivo
     */
    public static void writeFile(int[] list, String file) {
        try (FileWriter wr = new FileWriter(new File(file))) {
            for (int i : list) {
                wr.write(i + " ");
            }
        } catch (Exception e) {
            System.out.println("Error al escribir");
        }
    }

    /**
     * lee un archivo de enteros separados por espacios
     * @param file el nombre del archivo
     * @return el arreglo de los enteros leídos
     */
    public static int[] readFile(String file) {
        try ( Scanner sc = new Scanner(new File(file))) {

            String text = sc.nextLine();
            String[] txt = text.split(" ");
            int[] list = new int[txt.length];
            for (int i = 0; i < txt.length; i++) {
                list[i] = Integer.parseInt(txt[i]);
            }
            return list;

        } catch (Exception e) {
            System.out.println("Error en la lectura");
        }
        return null;
    }
}