public class Main {

    /**
     * In Lab02, our objective is to implement BubbleSort, MergeSort,
     * and InsertionSort that will pass an array of integers and will sort
     * the array with all 3 sorting methods. First thing I will do is create classes
     * for each sorting method and then in the Main I will call each class and pass
     * myArray. I will also add how long the run time of each method was.
     * @param args
     */
    public static void main(String[] args) {
        // Implementing BubbleSort sorting method
        int[] myArray1 = {23,2,14,41,11,5,3,99,10};

        BubbleSort bub = new BubbleSort();
        System.out.print("Unsorted list:\n");
        bub.print(myArray1);

        long start1 = System.nanoTime(); //Handle on the start time for run time in nanoseconds
        bub.sort(myArray1);
        System.out.println("\nSorted by Bubble Sort:");
        bub.print(myArray1);
        long end1 = System.nanoTime(); //Handle on the end time for run time in nanoseconds
        System.out.println("\nRun time: "+(end1-start1)+" nanoseconds");

        System.out.println("---------------------");

        //Implementing MergeSort
        int[] myArray2 = {65,9,32,12,19,74,1};

        MergeSort mSort = new MergeSort();
        System.out.println("Unsorted list:");
        mSort.print(myArray2);

        long start2 = System.nanoTime();
        mSort.mergeSort(myArray2, myArray2.length);
        System.out.println("\nSorted by Merge Sort:");
        mSort.print(myArray2);
        long end2 = System.nanoTime();
        System.out.println("\nRun time: "+(end2-start2)+" nanoseconds");

        System.out.println("---------------------");

        //Implementing InsertionMerge
        int[] myArray3 = {200,100,90,30,20,40,10};

        InsertionSort insertionSort = new InsertionSort();
        System.out.println("Unsorted list:");
        insertionSort.print(myArray3);

        long start3 = System.nanoTime();
        insertionSort.insertion(myArray3);
        System.out.println("\nSorted by Insertion:");
        insertionSort.print(myArray3);
        long end3 = System.nanoTime();
        System.out.println("\nRun time: "+(end3-start3)+" nanoseconds");














    }
}