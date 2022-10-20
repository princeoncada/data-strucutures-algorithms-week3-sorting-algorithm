public class TestSortingAlgorithmTest {
    public static void main(String[] args) {
        double[] arr = {1, 5, 3, 2, 4};
        SortingAlgorithm_OncadaTest sort = new SortingAlgorithm_OncadaTest(arr);
        String sortedArr = "";

        sortedArr = sort.bubbleSort(0)+"\n";
        System.out.println(sortedArr);
        sortedArr = sort.selectionSort(0)+"\n";
        System.out.println(sortedArr);
        sortedArr = sort.exchangeSort(0)+"\n";
        System.out.println(sortedArr);
        sortedArr = sort.insertionSort(0)+"\n";
        System.out.println(sortedArr);
        sortedArr = sort.quickSort(0)+"\n";
        System.out.println(sortedArr);
    }
}
