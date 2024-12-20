public class InsertionSort {
    /**
     * This class will store and hold the function
     * used to sort through an array using insertion sort
     * @param array
     * @return
     */

    public int[] insertion(int[] array){
        for(int i = 0; i < array.length; i++){
            int key = array[i];
            int j = i - 1;

            // Move elements in the array that are greater
            // than the key to position higher than the current position
            while(j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j-=1;
            }
            array[j+1]=key;
        }
        return array;
    }

    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
