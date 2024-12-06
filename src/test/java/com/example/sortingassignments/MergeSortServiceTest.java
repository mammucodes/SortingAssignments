package com.example.sortingassignments;

import com.example.sortingassignments.Service.MergeSortService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortServiceTest {
    MergeSortService mss = new MergeSortService();

    @Test
    public void getMergeSortTest() {
        int[] input = {12, 6, 24, 45, 32};
        int[] expected = {6, 12, 24, 32, 45};
        mss.mergeSort(input);
        Assertions.assertArrayEquals(expected, input);
    }

    @Test
    public void getMergeSortIfNullTest() {

        int[] input = null;
        try {
            mss.mergeSort(input);
            Assertions.fail("When Null is pass this should throw IllegalArgumentException");
        } catch (IllegalArgumentException ex) {

        } catch (Exception ex) {
            Assertions.fail("Should throw IllegalArgumentException.. but got " + ex.getClass().getName());
        }

    }

    @Test
    public void getMergeSortTestIfEmpty() {
        int[] excepted = {};
        int[] input = {};
        mss.mergeSort(input);
        Assertions.assertArrayEquals(excepted, input);
    }

    @Test
    public void getMergeTest() {
        int[] arr = {6, 2, 34, 44, 12};
        int[] leftArray = {2, 6};
        int[] rightArray = {12, 34, 44};
        int[] excepted = {2, 6, 12, 34, 44};
        mss.merge(arr, leftArray, rightArray);
        Assertions.assertArrayEquals(excepted, arr);
    }

    @Test
    public void getMergeTestIfPassedArrayIsNull() {
        int[] arr = null;
        int[] leftArray = {2, 45};
        int[] rightArray = {4, 7, 5};
        try {
            mss.merge(arr, leftArray, rightArray);
            Assertions.fail("When Null is pass this should throw IllegalArgumentException.. BUt");
        } catch (Exception ex) {
            assert ex.getClass().equals(IllegalArgumentException.class);
        }

    }

    @Test
    public void getMergeTestIfLeftAndRightArraysAreNull() {
        int[] arr = {1, 4, 5, 2};
        int[] leftArray = null;
        int[] rightArray = null;
        try {
            mss.merge(arr, leftArray, rightArray);
            Assertions.fail("When Null is Passed It should throw an exception  but it is not throwing");
        } catch (Exception ex) {
            Assertions.assertEquals(IllegalArgumentException.class, ex.getClass(), "The exception should be IllegalArgumentException");

        }
    }

    @Test
    public void getMergeTestIfArrSizeIsLessThanBothLeftAndRightSubArrays() {
        int[] arr = new int[4];
        int[] leftArray = {2, 22, 44};
        int[] rightArray = {22, 35, 43};
        try {
            mss.merge(arr, leftArray, rightArray);
            Assertions.fail("When Arr size is less than total size of left and right array it should throw and exception . BUt it is not throwing");
        } catch (Exception ex) {
            Assertions.assertEquals(IllegalArgumentException.class, ex.getClass(), "The excpetion should be IllegalArgumentException");
        }
    }

    @Test
    public void getMergeTestIfLeftArrayIsNull() {
        int[] arr = new int[3];
        int[] lefArray = null;
        int[] rightArray = {2, 3, 4};
        mss.merge(arr, lefArray, rightArray);
        int[] excepted = {2, 3, 4};
        Assertions.assertArrayEquals(excepted, arr);
    }

    @Test
    public void getMergeTestIfRightArrayISNull() {
        int[] arr = new int[4];
        int[] leftArray = {2, 14, 16, 23};
        int[] rightArray = null;
        int[] excepted = {2, 14, 16, 23};
        mss.merge(arr, leftArray, rightArray);
        Assertions.assertArrayEquals(excepted, arr);
    }
}
