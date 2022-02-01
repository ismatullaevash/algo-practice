/*
Given a string and a pattern, find out if the string contains any permutation of the pattern.

*/

import java.util.*;

class StringPermutation {
  public static boolean findPermutation(String str, String pattern) {
    // TODO: Write your code here
    int start =0;
    int counter = 0; 
    HashMap<Character,Integer> map = new HashMap<>();

    for (int i = 0; i < pattern.length();i++)
    {
      char right = pattern.charAt(i);
      map.put(right,map.getOrDefault(right,0)+1);
    }

    for(int end = 0; end < str.length(); end++)
    {
      char right = str.charAt(end);

      if(map.containsKey(right))
      {
        map.put(right,map.get(right)-1);
        if(map.get(right) == 0 )
        {
          counter++;
        }
      }
      if(counter == map.size())
      {
        return true;
      }
      if(end >= pattern.length()-1)
      {
        char left = str.charAt(start);
        start++;
          if(map.containsKey(left))
      {
       
        if(map.get(left) == 0 )
        {
          counter--;
           map.put(left,map.get(left)+1);
        }
      }
      }
    }
    return false;
  }
}
