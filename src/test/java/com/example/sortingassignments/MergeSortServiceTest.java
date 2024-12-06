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
        int[] expected = null;
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
    public void getMergeTest(){
        int[] arr = {6,2,34,44,12};
        int[] leftArray = null;
        int[] rightArray = {34,44,12};
        int[] excepted = {2,6,12,34,44};
        mss.merge(arr,leftArray,rightArray);
        Assertions.assertArrayEquals(excepted,arr);
    }

}
