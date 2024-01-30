package HDT3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class tests {
    
    @Test
    public void testBubble() {
        ISort sorter = new QuickSort();
        int[] list = Main.randomList(3000);
        list = sorter.sort(list);
        boolean good = true;
        for (int i = 0; i < list.length -1; i ++){
            if (list[i] > list[i+1]) {
                good  = false;
            }
        }
        assertEquals(true, good);
    }

    @Test
    public void testGnome() {
        GnomeSort gs = new GnomeSort();
        int[] list = Main.randomList(3000);
        list = gs.sort(list);
        boolean good = true;
        for (int i = 0; i < list.length -1; i ++){
            if (list[i] > list[i+1]) {
                good  = false;
            }
        }
        assertEquals(true, good);
    }

    @Test
    public void testMerge() {
        MergeSort m = new MergeSort();
        int[] list = Main.randomList(3000);
        list = m.sort(list);
        boolean good = true;
        for (int i = 0; i < list.length -1; i ++){
            if (list[i] > list[i+1]) {
                good  = false;
            }
        }
        assertEquals(true, good);
    }

    @Test
    public void testQuick() {
        QuickSort m = new QuickSort();
        int[] list = Main.randomList(3000);
        list = m.sort(list);
        boolean good = true;
        for (int i = 0; i < list.length -1; i ++){
            if (list[i] > list[i+1]) {
                good  = false;
            }
        }
        assertEquals(true, good);
    }

    @Test
    public void testRadix() {
        RadixSort m = new RadixSort();
        int[] list = Main.randomList(3000);
        list = m.sort(list);
        boolean good = true;
        for (int i = 0; i < list.length -1; i ++){
            if (list[i] > list[i+1]) {
                good  = false;
            }
        }
        assertEquals(true, good);
    }
}
