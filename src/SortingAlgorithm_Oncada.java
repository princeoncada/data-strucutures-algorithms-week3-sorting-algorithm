import javax.swing.JOptionPane;

public class SortingAlgorithm_Oncada {
    public String qsort_all = "";
    public int qsort_num = 1;
    public int[] arr;

    SortingAlgorithm_Oncada(int[] arr){
        this.arr = arr;
    }

    SortingAlgorithm_Oncada(){
        this.arr = new int[5];
    }

    SortingAlgorithm_Oncada(int size){
        this.arr = new int[size];
    }

    public void insertValues(){
        for(int i=0; i<this.arr.length; i++){
            this.arr[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Array Element #"+(i+1), "Integer Array Construction", JOptionPane.QUESTION_MESSAGE));
        }
    }

    public boolean stateChecker(int num1, int num2, int order) {
        if (order == 0) {
            return num1 > num2;
        }return num2 > num1;
    }

    public String stringIterator(int[] arr, int i){
        String all = "";

        all += "Iteration #"+(i+1)+": ";
        for(int x:arr){
            all += x + " ";
        }all += "\n";

        return all;
    }

//    Following methods for Bubble Sort

    public String bubbleSort(int order){
        String all = "";
        int hold;
        int[] arr = this.arr.clone();

        long start = System.nanoTime();
        all += "Bubble Sort Algorithm\n";

        for(int i=0; i<arr.length; i++){
            all += stringIterator(arr, i);
            for(int j=0; j<arr.length-1; j++){
                if(stateChecker(arr[j], arr[j+1], order)){
                    hold = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = hold;
                }
            }
        }

        long end = System.nanoTime();
        all += "Processing Time\t: "+(end-start)+" units.";
        return all;
    }

    public String bubbleSort(int[] arr_o, int order){
        String all = "";
        int[] arr = arr_o.clone();
        int hold;

        long start = System.nanoTime();
        all += "Bubble Sort Algorithm\n";

        for(int i=0; i<arr.length; i++){
            all += stringIterator(arr, i);
            for(int j=0; j<arr.length-1; j++){
                if(stateChecker(arr[j], arr[j+1], order)){
                    hold = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = hold;
                }
            }
        }

        long end = System.nanoTime();
        all += "Processing Time\t: "+(end-start)+" units.";
        return all;
    }

//    Following methods for Exchange Sort

    public String exchangeSort(int order){
        String all = "";
        int hold;
        int[] arr = this.arr.clone();

        long start = System.nanoTime();
        all += "Exchange Sort Algorithm\n";

        for(int i=0; i<arr.length; i++){
            all += stringIterator(arr, i);
            for(int j=i+1; j<arr.length; j++){
                if(stateChecker(arr[i], arr[j], order)){
                    hold = arr[i];
                    arr[i] = arr[j];
                    arr[j] = hold;
                }
            }
        }

        long end = System.nanoTime();
        all += "Processing Time\t: "+(end-start)+" units.";
        return all;
    }

    public String exchangeSort(int[] arr_o, int order){
        String all = "";
        int[] arr = arr_o.clone();
        int hold;

        long start = System.nanoTime();
        all += "Exchange Sort Algorithm\n";

        for(int i=0; i<arr.length; i++){
            all += stringIterator(arr, i);
            for(int j=i+1; j<arr.length; j++){
                if(stateChecker(arr[i], arr[j], order)){
                    hold = arr[i];
                    arr[i] = arr[j];
                    arr[j] = hold;
                }
            }
        }

        long end = System.nanoTime();
        all += "Processing Time\t: "+(end-start)+" units.";
        return all;
    }

//    Following methods for Insertion Sort

    public String insertionSort(int order){
        String all = "";
        int[] arr = this.arr.clone();

        long start = System.nanoTime();
        all += "Insertion Sort Algorithm\n";
        all += stringIterator(arr, 0);

        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && stateChecker(arr[j], current, order)){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
            all += stringIterator(arr, i);
        }

        long end = System.nanoTime();
        all += "Processing Time\t: "+(end-start)+" units.";
        return all;
    }

    public String insertionSort(int[] arr_o, int order){
        String all = "";
        int[] arr = arr_o.clone();

        long start = System.nanoTime();
        all += "Insertion Sort Algorithm\n";
        all += stringIterator(arr, 0);

        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && stateChecker(arr[j], current, order)){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
            all += stringIterator(arr, i);
        }

        long end = System.nanoTime();
        all += "Processing Time\t: "+(end-start)+" units.";
        return all;
    }

//    Following methods for Selection Sort

    public String selectionSort(int order){
        String all = "";
        int hold, index;
        int[] arr = this.arr.clone();

        long start = System.nanoTime();
        all += "Selection Sort Algorithm\n";

        for(int i=0; i<arr.length; i++){
            all += stringIterator(arr, i);
            index = i;
            for(int j=i+1; j<arr.length; j++){
                if(stateChecker(arr[index], arr[j], order)){
                    index = j;
                }
            }
            hold = arr[index];
            arr[index] = arr[i];
            arr[i] = hold;
        }

        long end = System.nanoTime();
        all += "Processing Time\t: "+(end-start)+" units.";
        return all;
    }

    public String selectionSort(int[] arr_o, int order){
        String all = "";
        int hold, index;
        int[] arr = arr_o.clone();

        long start = System.nanoTime();
        all += "Selection Sort Algorithm\n";

        for(int i=0; i<arr.length; i++){
            all += stringIterator(arr, i);
            index = i;
            for(int j=i+1; j<arr.length; j++){
                if(stateChecker(arr[index], arr[j], order)){
                    index = j;
                }
            }
            hold = arr[index];
            arr[index] = arr[i];
            arr[i] = hold;
        }

        long end = System.nanoTime();
        all += "Processing Time\t: "+(end-start)+" units.";
        return all;
    }

//    Following methods for Quick Sort

    public String quickSort(int order){
        int low = 0, high = arr.length-1;
        int[] arr = this.arr.clone();

        long start = System.nanoTime();
        this.qsort_all += "Quick Sort Algorithm\n";

        quickSort(arr, low, high, order);
        qsort_stringIterator(arr);

        long end = System.nanoTime();
        this.qsort_all += "Processing Time\t: "+(end-start)+" units.";
        return this.qsort_all;
    }

    public String quickSort(int[] arr_o, int order){
        int low = 0, high = arr.length-1;
        int[] arr = arr_o.clone();

        long start = System.nanoTime();
        this.qsort_all += "Quick Sort Algorithm\n";

        quickSort(arr, low, high, order);
        qsort_stringIterator(arr);

        long end = System.nanoTime();
        this.qsort_all += "Processing Time\t: "+(end-start)+" units.";
        return this.qsort_all;
    }

    public boolean qsort_stateChecker(int num1, int num2, int order) {
        if (order == 0) {
            return num1 > num2;
        }return num2 >= num1;
    }

    public void swap(int[] arr, int i, int j) {
        int hold = arr[i];
        arr[i] = arr[j];
        arr[j] = hold;
    }

    public int partition(int[] arr, int low, int high, int order) {
        int pivot = arr[high];
        int i = (low - 1);

        for(int j = low; j <= high-1; j++) {
            if(qsort_stateChecker(pivot, arr[j], order)) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return (i + 1);
    }

    public void qsort_stringIterator(int[] arr) {
        this.qsort_all += "Iteration #"+(qsort_num)+": ";
        for(int x:arr){
            this.qsort_all += x + " ";
        }this.qsort_all += "\n";
    }

    public void quickSort(int[] arr, int low, int high, int order) {
        if(low < high) {
            qsort_stringIterator(arr);
            qsort_num += 1;
            int mid = partition(arr, low, high, order);
            quickSort(arr, low, mid - 1, order);
            quickSort(arr, mid + 1, high, order);
        }
    }
}
