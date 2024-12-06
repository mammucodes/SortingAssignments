package com.example.sortingassignments.Service;

import org.springframework.stereotype.Service;

@Service
public class MergeSortService {

//This method takes input  int[] arr  and
    // returns same  passed array as sortedarray in ascending order
    //if input arr[] size < 2 it returns
    //when input is null, then it throws illegalArgumentException


    public void mergeSort(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException();
        }
        if (arr.length < 2) {
            return;
        }
        int mid = arr.length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[arr.length - mid];
        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = arr[i];
        }
        for (int j = 0; j < rightArray.length; j++) {
            rightArray[j] = arr[mid + j];
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(arr, leftArray, rightArray);
    }


    //This methods takes input as orginalarray (size >= size of left array + right array), SORTED leftarray, SORTED rightArray
    // and merge them and updates orginal array with all elements in sorted order
    //if passed inputs are null throws illegal argument exception


    // case1: arr == null, not good inout , throw exception
    //case 2: leftArr = null, rightArr = null , thorw exception
    //case 3 :  if leftArr =null and rightArr!=null then  arr[] = rightArr[];
    //case 4 :  if rightArr =null and leftArr!=null then  arr[] = leftArr[];
    //case 5 :  leftArr != null, rightArr!= null then arr = leftArr+rightArr;
    public void merge(int[] arr, int[] leftArray, int[] rightArray) {

        if (arr == null) {
            throw new IllegalArgumentException();
        }

        if (leftArray == null && rightArray == null) {
            throw new IllegalArgumentException();
        }

        int leftSize = leftArray != null ? leftArray.length : 0;
        int rightSize = rightArray != null ? rightArray.length : 0;

        int totalArrSize = leftSize + rightSize;

        if (arr.length < totalArrSize) {
            throw new IllegalArgumentException();
        }
        int leftIndex = 0;
        int rightIndex = 0;
        int arrIndex = 0;
        if (leftArray != null && rightArray != null) {
            while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                    arr[arrIndex] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    arr[arrIndex] = rightArray[rightIndex];
                    rightIndex++;
                }
                arrIndex++;
            }
        }
        while (leftArray != null && leftIndex < leftArray.length) {
            arr[arrIndex] = leftArray[leftIndex];
            leftIndex++;
            arrIndex++;

        }

        while (rightArray != null && rightIndex < rightArray.length) {
            arr[arrIndex] = rightArray[rightIndex];
            rightIndex++;
            arrIndex++;

        }
    }
}

