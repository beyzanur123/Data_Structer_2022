public class SearchAlgorithms {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Linear search
        int key = 6;
        int index = linearSearch(array, key);
        if (index != -1) {
            System.out.println("Linear search: " + key + " found at index " + index);
        } else {
            System.out.println("Linear search: " + key + " not found");
        }

        // Binary search
        key = 4;
        index = binarySearch(array, key);
        if (index != -1) {
            System.out.println("Binary search: " + key + " found at index " + index);
        } else {
            System.out.println("Binary search: " + key + " not found");
        }
    }

    // Linear search
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Binary search
    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == key) {
                return middle;
            } else if (array[middle] < key) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
