public class SortingAlgorithms {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 3};

        // Quick Sort
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Quick sort: " + Arrays.toString(arr));

        arr = new int[]{5, 2, 8, 1, 9, 3};
        // Bubble Sort
        bubbleSort(arr);
        System.out.println("Bubble sort: " + Arrays.toString(arr));

        arr = new int[]{5, 2, 8, 1, 9, 3};
        // Insertion sort
        insertionSort(arr);
        System.out.println("Insertion sort: " + Arrays.toString(arr));

        arr = new int[]{5, 2, 8, 1, 9, 3};
        // Merge sort
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Merge sort: " + Arrays.toString(arr));
    }

    //Quick Sort
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //Insertion Sort
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[