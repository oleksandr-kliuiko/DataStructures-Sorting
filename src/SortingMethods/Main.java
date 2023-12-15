package SortingMethods;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 44, 2, 1, 6, 111, 9, 22, 0, 11, -3};
        print(arr);

        System.out.println();

        selectionSort(arr);

        print(arr);
    }

    //Cкладність алгоритму: O(n^2)
    public static void bubbleSort(int[] array) {
        long start = System.nanoTime();
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i-1);
                    flag = true;
                }
            }
        }
        long time = System.nanoTime() - start;
        System.out.println("\nBubble sort: " + time + "ns");
    }

    //Cкладність алгоритму: O(n^2)
    public static void selectionSort(int[] array) {
        long start = System.nanoTime();
        for (int left = 0; left < array.length; left++) {
            int min = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[min]) {
                    min = i;
                }
            }
            swap(array, left, min);
        }
        long time = System.nanoTime() - start;
        System.out.println("\nSelection sort: " + time + "ns");
    }

    //Cкладність алгоритму: O(n^2)
    public static void insertionSort(int[] array) {
        long start = System.nanoTime();
        for (int left = 1; left < array.length; left++) {
            // Дістаємо значення елемента
            int value = array[left];
            // проходимось по елементах, які перед витягнутим елементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // якщо витягнули значення менше, то пересуваємо більший елемент далі
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // якщо витягнутий елемент більший, то зупиняємось
                    break;
                }
            }
            // у місце, що звільнилося, вставляємо витягнуте значення
            array[i + 1] = value;
        }
        long time = System.nanoTime() - start;
        System.out.println("\nInsertion sort: " + time + "ns");
    }

    //Cкладність алгоритму: O(n log(n))
    public static void quickSort(int[] array) {
        long start = System.nanoTime();
        if (array == null || array.length == 0) {
            return;
        }
        int length = array.length;
        quickSortRecursive(array, 0, length - 1);

        long time = System.nanoTime() - start;
        System.out.println("\nQuick sort: " + time + "ns");
    }

    // Рекурсивний метод швидкого сортування
    private static void quickSortRecursive(int[] array, int low, int high) {
        if (low < high) {
            // Отримуємо індекс роздільника (розбиття)
            int partitionIndex = partition(array, low, high);

            // Рекурсивно сортуємо елементи перед і після роздільника
            quickSortRecursive(array, low, partitionIndex - 1);
            quickSortRecursive(array, partitionIndex + 1, high);
        }
    }

    // Метод для розділення масиву на дві частини
    private static int partition(int[] array, int low, int high) {
        // Вибираємо останній елемент як роздільник
        int pivot = array[high];
        int i = low - 1;

        // Переміщуємо елементи менше роздільника в ліву частину, більше - в праву
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }

        // Поміщаємо роздільник на правильне місце
        swap(array, i + 1, high);
        return i + 1;
    }

    //Cкладність алгоритму: O(n log(n))
    public static void mergeSort(int[] array) {
        long start = System.nanoTime();

        mergeSortRecursive(array);

        long time = System.nanoTime() - start;
        System.out.println("\nMerge sort: " + time + "ns");
    }

    private static void mergeSortRecursive(int[] array) {
        if (array.length <= 1) {
            return; // Вихід з рекурсії: масив вже відсортований, якщо його розмір 1 або менший.
        }

        // Розділення масиву на два підмасиви.
        int middle = array.length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[array.length - middle];

        System.arraycopy(array, 0, leftArray, 0, middle);
        System.arraycopy(array, middle, rightArray, 0, array.length - middle);

        // Рекурсивний виклик для кожного підмасиву.
        mergeSortRecursive(leftArray);
        mergeSortRecursive(rightArray);

        // Злиття двох відсортованих підмасивів.
        merge(array, leftArray, rightArray);
    }

    private static void merge(int[] result, int[] left, int[] right) {
        int i = 0; // Індекс для лівого підмасиву.
        int j = 0; // Індекс для правого підмасиву.
        int k = 0; // Індекс для об'єднаного масиву.

        // Порівнюємо елементи лівого та правого підмасивів і об'єднуємо їх у відсортований масив.
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }

        // Додаємо залишок з лівого та правого підмасивів (якщо вони є).
        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void print(int[] array) {
        for (int i : array)
            System.out.print(i + " ");
    }
}
