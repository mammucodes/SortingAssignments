
package com.example.sortingassignments;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/sorting")
public class SortingController {
    private static final Logger logger = LoggerFactory.getLogger(SortingController.class);
    @Autowired
    private SortingService service;

    @PostMapping("/bubblesort")
    public int[] bubbleSort(@RequestBody int[] arr) {
        logger.debug("bubbleSort api called");
        int[] sortedArray = service.bubbleSort(arr);
        return sortedArray;
    }





//    public static void printarray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }

}








