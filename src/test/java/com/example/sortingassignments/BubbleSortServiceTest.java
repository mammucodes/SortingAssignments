package com.example.sortingassignments;

import com.example.sortingassignments.Service.BubbleSortService;
import com.example.sortingassignments.Service.BubbleSortService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortServiceTest {
    BubbleSortService ss= new BubbleSortService();
    @Test
    public void getBubbleSortTest(){
        int[] input = {12,46,24,9,62,34};
        int[] excepted = {9, 12, 24,34,46,62};
        int[] actual = ss.bubbleSort(input);
        Assertions.assertArrayEquals(excepted, actual );
    }

    @Test
    public void getBubbleSortWhenInputIsNullTest(){
        int[] actual = ss.bubbleSort(null);
        Assertions.assertNull(actual);
    }

    @Test
    public void getBubbleSortWhenArrayEmptyTest(){
        int[] input = {};
        int[] excepted = {};
        int[] actual = ss.bubbleSort(input);
        Assertions.assertArrayEquals(excepted, actual);


    }
}
