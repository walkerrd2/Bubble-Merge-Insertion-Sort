/**
 * This class will hold our functions that will
 * implement BubbleSort and will print out array
 */
public class BubbleSort {

    public int[] sort(int[] array){
        for(int i = 0; i < array.length-1; i++){
            for(int j = 0; j < array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    // This will swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    /**
     * This print method will be implemented in
     * every class
     * @param array
     */
    public void print(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }

}
