public class TestSortingAlgorithm {
    public static void main(String[] args) {
        int[] arr = {23, 65, 10, 5, 37};
        int[] arr2 = {32, 56, 1, 15, 73};
        String sortedArray;

/*
        You can instantiate a sort object with an int array, int array size argument, or no argument creating a default
        int array with a size of 5.

        Example 1: SortingAlgorithm_Oncada sort = new SortingAlgorithm_Oncada();
        Example 2: SortingAlgorithm_Oncada sort = new SortingAlgorithm_Oncada(10);
        Example 3: SortingAlgorithm_Oncada sort = new SortingAlgorithm_Oncada(arr2);
*/

        SortingAlgorithm_Oncada sort = new SortingAlgorithm_Oncada(arr);

//      You can insert elements if the instantiated array is empty or replace elements for the present array using:
//      sort.insertValues();

/*
        All sorting methods are overloaded. If the instantiated object is assigned with an array containing elements,
        then you can simply input 0 (Ascending) or 1 (Descending) as an argument with how the elements of the int array
        should be sorted.

        Example:
            int[] arr2 = {9, 7, 6, 10, 8};
            String sortedArray = "";
            SortingAlgorithm_Oncada sort = new SortingAlgorithm_Oncada(arr2);
            sortedArray = sort.bubbleSort(0)+"\n";
            System.out.println(sortedArray);
            sortedArray = sort.bubbleSort(1)+"\n";
            System.out.println(sortedArray);

        You can also manually include an int array as a first argument which is going to be prioritized for sorting.

        Example:
            int[] arr = {4, 2, 1, 5, 3};
            int[] arr2 = {9, 7, 6, 10, 8};
            String sortedArray = "";
            SortingAlgorithm_Oncada sort = new SortingAlgorithm_Oncada(arr2);
            sortedArray = sort.bubbleSort(arr1, 0)+"\n";
            System.out.println(sortedArray);

*/

        sortedArray = sort.bubbleSort(1)+"\n";
        System.out.println(sortedArray);
        sortedArray = sort.exchangeSort(0)+"\n";
        System.out.println(sortedArray);
        sortedArray = sort.insertionSort(arr2, 1)+"\n";
        System.out.println(sortedArray);
        sortedArray = sort.selectionSort(arr2, 0)+"\n";
        System.out.println(sortedArray);
        sortedArray = sort.quickSort(1)+"\n";
        System.out.println(sortedArray);

        }
    }

