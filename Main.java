package HDT3;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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

    public ArrayList<Integer> randomList(int n) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <n; i++) {
            list.add(r.nextInt(3000) + 1);
        }
        return list;
    }

    public void writeFile(ArrayList<Integer> list, String file) {
        try (FileWriter wr = new FileWriter(new File(file))) {
            for (int i : list) {
                wr.write(i + " ");
            }
        } catch (Exception e) {
            System.out.println("Error al escribir");
        }
    }

    public ArrayList<Integer> readFile(String file) {
        try ( Scanner sc = new Scanner(new File(file))) {
            ArrayList<Integer> list = new ArrayList<>();
            String text = sc.nextLine();
            String[] txt = text.split(" ");
            for (var x : txt) {
                list.add(Integer.parseInt(x));
            }
            return list;

        } catch (Exception e) {
            System.out.println("Error en la lectura");
        }
        return null;
    }
}