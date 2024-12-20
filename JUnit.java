import org.junit.Test;
import static org.junit.Assert.*;
public class JUnit {

    @Test
    public void bubbleTest(){
        int[] actual = {98,73,2,1,5,20,43};
        int[] expected = {1,2,5,20,43,73,98};
        BubbleSort bSort = new BubbleSort();
        bSort.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void mergeTest(){
        int[] actual = {87,34,25,2,1,90};
        int[] expected = {1,2,25,34,87,90};
        MergeSort mSort = new MergeSort();
        mSort.mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void insertionTest(){
        int[] actual = {65,44,12,3,1,98,21};
        int[] expected = {1,3,12,21,44,65,98};
        InsertionSort iSort = new InsertionSort();
        iSort.insertion(actual);
        assertArrayEquals(expected, actual);
    }



}
