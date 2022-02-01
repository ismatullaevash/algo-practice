/*
Write a method to merge our arrays of orders into one sorted array.
*/

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class Solution {

    public static List<Integer> mergeArrays(int[] myArray, int[] alicesArray) {

        // combine the sorted arrays into one large sorted array
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>((n1, n2) -> n1 - n2);
        for(int val: alicesArray) {
            minHeap.add(val);
        }
        for(int val :myArray) {
            minHeap.add(val);
        }
        
        int len= Math.max(myArray.length,alicesArray.length);
        List<Integer> res= new ArrayList<>();
        while(!minHeap.isEmpty()){
            res.add(minHeap.poll());
        }
        return res;
    }
