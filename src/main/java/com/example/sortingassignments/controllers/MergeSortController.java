package com.example.sortingassignments.controllers;

import com.example.sortingassignments.Service.MergeSortService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/Sorting")
public class MergeSortController {
   private static final Logger logger =   LoggerFactory.getLogger(MergeSortController.class);
    @Autowired
    public MergeSortService  mergeservice;

    @PostMapping("/mergeSort")
    public  int[]  mergeSort(@RequestBody int[] arr){
        logger.debug("mergeSort api called");
       if(arr.length ==0){
           logger.debug("returning empty array");
           return arr;
       }
         mergeservice.mergeSort(arr);
           return arr;
    }
}
