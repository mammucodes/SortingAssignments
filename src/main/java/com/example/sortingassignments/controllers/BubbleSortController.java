
package com.example.sortingassignments.controllers;


import com.example.sortingassignments.Service.BubbleSortService;
import com.example.sortingassignments.Service.BubbleSortService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/sorting")
public class BubbleSortController {
    private static final Logger logger = LoggerFactory.getLogger(BubbleSortController.class);
    @Autowired
    private BubbleSortService service;

    //This method takes input array of integers, nd returns sorted array of integer
    @PostMapping("/bubblesort")
    public int[] bubbleSort(@RequestBody int[] arr) {
        logger.debug("bubbleSort api called");
        if (arr.length == 0) {
            logger.debug("passed input array is empty");
            return arr;
        }
        return service.bubbleSort(arr);
    }

    @PostMapping("/mergesort")
    public void  mergeSort(@RequestBody int[] arr) {
        logger.debug("mergeSort api called");
        if(arr.length==0){
            logger.debug("passed input is empty");
           // return arr;
        }
//return service.mergeSort(arr);
    }

//    public static void printarray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }

}








