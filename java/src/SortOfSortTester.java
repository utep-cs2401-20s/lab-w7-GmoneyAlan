import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortOfSortTester {

    @Test
    public void sortOfSort1(){
        SortOfSort sos = new SortOfSort();
        int[] a = {1,2,3,4,5,6};
        int[] m = {4,3,1,2,5,6};
        sos.sortOfSort(a);
        assertArrayEquals(m, a);
    }

    @Test
    public void sortOfSort2(){
        SortOfSort sos = new SortOfSort();
        int[] alan = {4,3,1,2,5,6};
        int[] alan2 = {4,3,1,2,5,6};
        sos.sortOfSort(alan);
        assertArrayEquals(alan2, alan);
    }

    @Test
    public void sortOfSort3(){
        SortOfSort sos = new SortOfSort();

    }

    @Test
    public void sortOfSort4(){
        SortOfSort sos = new SortOfSort();

    }

    @Test
    public void sortOfSort5(){
        SortOfSort sos = new SortOfSort();

    }

}
