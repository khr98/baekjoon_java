package sort;

import java.util.Scanner;

public class MainTest2750 {
    private static int[] arr;
    private static int SIZE;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        SIZE = scanner.nextInt();
        arr = new int[SIZE];

        for (int i = 0; i < SIZE; i++){
            arr[i] = scanner.nextInt();
        }
        quickSort(arr);
        for (int j = 0; j < arr.length; j++)
            System.out.println(arr[j]);
    }
    public static void quickSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int low, int high){
        if (low >= high) return;
        int mid = partition(arr, low, high);
        sort(arr, low, mid - 1);
        sort(arr, mid, high);
    }

    private static int partition(int[] arr, int low, int high){
       int pivot = arr[(low + high) / 2];

       while (low <= high){
           while (arr[low] < pivot)
               low++;
           while (arr[high] > pivot)
               high--;
           if (low <= high) {
               swap(arr, low, high);
               low++;
               high--;
           }
       }
       return low;
    }

    private static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
