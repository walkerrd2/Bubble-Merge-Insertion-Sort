public class MergeSort {
    /**
     * This class will hold our functions that will
     * implement MergeSort. MergeSort will take an inputted array,
     * merge two subarrays of the array. The first subarray is
     * array[left...mid]. The second subarray is array[mid+1...right].
     * @param array
     * @return
     */
    public void merge(int[] array, int[] l, int[] r, int left, int right){
        //initial indices of first and second subarrays
        int i = 0;
        int j = 0;
        //initial index of merged subarray array
        int k = 0;
        while(i < left && j < right){
            if(l[i] <= r[j]){
                array[k] = l[i];
                k++;
                i++;
            } else {
                array[k] = r[j];
                k++;
                j++;
            }
        }
        // Copy the remaining elements of left side if any
        while(i<left){
            array[k] = l[i];
            k++;
            i++;
        }
        // Copy the remaining elements of right side if any
        while(j < right){
            array[k]=r[j];
            k++;
            j++;
        }
    }

    public int[] mergeSort(int[] array, int n){
        // makes sure that inputted array is greater than 2 indices in length
        if(n < 2){
            return array;
        }
        int mid = n/2; //finding middle of array
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for(int i = 0; i < mid; i++){
            left[i] = array[i];
        }
        for(int i = mid; i < n; i++){
            right[i - mid] = array[i];
        }
        mergeSort(left, mid);
        mergeSort(right, n-mid);
        merge(array,left,right,mid,n-mid);

        return array;
    }

    public void print(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }










}
