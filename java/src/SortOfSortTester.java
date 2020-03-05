import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortOfSortTester {
    //Test 1 is to see if the array is working with a simple length 6 array
    @Test
    public void sortOfSort1(){
        SortOfSort sos = new SortOfSort();
        int[] a = {1,2,3,4,5,6};
        int[] m = {4,3,1,2,5,6};
        sos.sortOfSort(a);
        assertArrayEquals(m, a);
    }
    //This test case is to see if the array will stay sorted the way our lab requires it
    //or if it'll mess up the sortOfSorted
    @Test
    public void sortOfSort2(){
        SortOfSort sos = new SortOfSort();
        int[] alan = {4,3,1,2,5,6};
        int[] alan2 = {4,3,1,2,5,6};
        sos.sortOfSort(alan);
        assertArrayEquals(alan2, alan);
    }
    //
    @Test
    public void sortOfSort3(){
        SortOfSort sos = new SortOfSort();
        int[] alan = {1};
        int[] alan2 = {1};
        sos.sortOfSort(alan);
        assertArrayEquals(alan2, alan);
    }

    @Test
    public void sortOfSort4(){
        SortOfSort sos = new SortOfSort();
        int[] alan = {1,2,3,4,5,6,7};
        int[] alan2 = {5,4,1,2,3,6,7};
        sos.sortOfSort(alan);
        assertArrayEquals(alan2, alan);
    }

    @Test
    public void sortOfSort5(){
        SortOfSort sos = new SortOfSort();
        int[] alan = {-1,-2,-7,-3,10,30, 5};
        int[] alan2 = {5,-1,-7,-3,-2,10,30};
        sos.sortOfSort(alan);
        assertArrayEquals(alan2, alan);
    }

}
