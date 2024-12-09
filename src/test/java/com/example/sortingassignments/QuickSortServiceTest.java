package com.example.sortingassignments;

import com.example.sortingassignments.Service.QuickSortService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuickSortServiceTest {
    QuickSortService qs = new QuickSortService();

    @Test
    public void quickSortTest() {
        int[] arr = {8, 3, 7, 4, 6, 2, 5};
        int[] excepted = {2, 3, 4, 5, 6, 7, 8};
        qs.quickSort(arr);
        Assertions.assertArrayEquals(excepted, arr);

    }

    @Test
    public void quickSortTestIfArrayIsNull() {
        int[] input = null;
        try {
            qs.quickSort(input);
            Assertions.fail("When a null array is passed it should throw an exception . but it is not throwing");
        } catch (IllegalArgumentException ie) {

        } catch (Exception ex) {
            Assertions.fail("should throw illegal argument exception but throwing " + ex.getClass().getName() + " Exception ");
        }
    }

    @Test
    public void quickSortTestIfArrayIsNull_2() {
        int[] input = null;
        try {
            qs.quickSort(input);
            Assertions.fail("When a null array is passed it should throw an exception . but it is not throwing");
        } catch (Exception ex) {
            Assertions.assertEquals(IllegalArgumentException.class, ex.getClass(),"it is not throwing excepted exception but got :");
        }
    }

    @Test
    public void quickSOrtTestIfArrayIsEmpty() {
        int[] input = {};
        qs.quickSort(input);
        int[] excepted = {};
        Assertions.assertArrayEquals(excepted, input);


    }

}


