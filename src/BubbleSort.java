public class BubbleSort {
    void bubbleSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    void printArray(int[] arr)
    {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        BubbleSort ob = new BubbleSort();
        int[] arr = { 5, 1, 4, 2, 8 };
        System.out.println("Unsorted array");
        ob.printArray(arr);
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
