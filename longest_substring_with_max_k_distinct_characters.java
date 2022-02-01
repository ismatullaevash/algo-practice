/*
Given a string, find the length of the longest substring in it with no more than K distinct characters.
*/


import java.util.*;

class LongestSubstringKDistinct {
  public static int findLength(String str, int k) {
    // TODO: Write your code here
    HashMap<Character, Integer> freq=new HashMap<>();
    int windowStart=0; int maxLength=-1;
    for(int windowEnd=0;windowEnd<str.length();windowEnd++){
      char right=str.charAt(windowEnd);
      freq.put(right, freq.getOrDefault(right,0)+1);
      while(freq.size()>k){
        char left=str.charAt(windowStart);
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
