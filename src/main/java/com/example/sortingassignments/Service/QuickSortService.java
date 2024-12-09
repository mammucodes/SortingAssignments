package com.example.sortingassignments.Service;

import java.sql.Array;

public class QuickSortService {
    public static void main(String[] args) {
        int[] arr = {8, 3, 7, 4, 6, 2, 5};
        QuickSortService qs = new QuickSortService();
        qs.quickSort(arr);
        System.out.print("{");
        for (int i = 0; i <= (arr.length - 2); i++) {
            System.out.print(arr[i] + ",");
        }
        int lastIndex = arr.length - 1;
        System.out.print(arr[lastIndex]);
        System.out.print("}");
    }

    // this method   takes  int[] unsorted array and returns sorted array using quicksort alogrithm
    // it throws an exception if  passed array is null
    // it returns  same array if length = 0;


    public void quickSort(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException();
        }
        int startIndex = 0;
        int endIndex = (arr.length) - 1;
        quickSortInternal(arr, startIndex, endIndex);
    }

    private void quickSortInternal(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex)
            return;
        int pivotIndex = startIndex;
        int i = startIndex + 1;
        int j = endIndex;
        int n = arr.length;
        while (true) {
            while (i < n && arr[i] < arr[pivotIndex] && i <= j) {
                i++;
            }

            while (j >= 0 && arr[j] > arr[pivotIndex] && i <= j) {
                j--;
            }
            if (i > j) {

                int temp = arr[pivotIndex];
                arr[pivotIndex] = arr[j];
                arr[j] = temp;
                //call quicksort for left st, j-1
                quickSortInternal(arr, startIndex, j - 1);
                quickSortInternal(arr, j + 1, endIndex);
                break;

            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

    }

    ;
}
