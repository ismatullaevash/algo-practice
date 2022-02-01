/*
Given an array of characters where each character represents a fruit tree, you are given two baskets, and your goal is to put maximum number of fruits in each basket. The only restriction is that each basket can have only one type of fruit.

You can start with any tree, but you can’t skip a tree once you have started. You will pick one fruit from each tree until you cannot, i.e., you will stop when you have to pick from a third fruit type.

Write a function to return the maximum number of fruits in both baskets.

*/

import java.util.*;

class MaxFruitCountOf2Types {
  public static int findLength(char[] arr) {
    // TODO: Write your code here
    HashMap<Character, Integer> freq=new HashMap<>();
    int windowStart=0; int maxLength=-1;
    for(int windowEnd=0;windowEnd<arr.length;windowEnd++){
      char right=arr[windowEnd];
      freq.put(right, freq.getOrDefault(right,0)+1);
      while(freq.size()>2){
        char left=arr[windowStart];
        freq.put(left, freq.getOrDefault(left,0)-1);
        if(freq.get(left)==0){
          freq.remove(left);
        }
        windowStart++;
      }
      maxLength=Math.max(maxLength,windowEnd-windowStart+1);
    }
    return maxLength;
  }
}
