/*
Given a string, find the length of the longest substring, which has all distinct characters.

*/

import java.util.*;

class NoRepeatSubstring {
  public static int findLength(String str) {
    // TODO: Write your code here
    HashMap<Character,Integer> map = new HashMap<>();
    int length = 0;
    int start = 0;

    for(int end = 0; end< str.length(); end++)
    {
      char right = str.charAt(end);
    
        if(map.containsKey(right))
        {
          start = Math.max(start, map.get(right)+1);
        }
        map.put(right,end); 
      length = Math.max(length, end - start + 1);
    }

    return length;
  }
}
