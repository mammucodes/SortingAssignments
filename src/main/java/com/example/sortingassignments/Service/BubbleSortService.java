package com.example.sortingassignments.Service;

import jakarta.annotation.Nonnull;
import org.springframework.stereotype.Service;


@Service
public class BubbleSortService {
    // arr the integer array to be sorted; if input is null, null is returned
    // and  returns sorted  array in ascending order  by using bubblesort algorithm
    public int[] bubbleSort (int[] arr) {
        if(arr == null)
            return  null;
        int n = arr.length;
        boolean isSwapped;
        for (int i = 0; i < n - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped)
                break;
        }
        return arr;
    }
    public int[] mergeSort(int[] arr){
        return null;
    }

}
