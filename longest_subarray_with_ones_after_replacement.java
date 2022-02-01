/*
Given an array containing 0s and 1s, if you are allowed to replace no more than ‘k’ 0s with 1s, find the length of the longest contiguous subarray having all 1s.
*/

class ReplacingOnes {
  public static int findLength(int[] arr, int k) {
     // TODO: Write your code here
  int start = 0;
  int repeated = 0;
  int length = 0;
  HashMap<Integer,Integer> map = new HashMap<>();

  for (int end = 0; end< arr.length; end++)
  {
    int right = arr[end];
    map.put(right,map.getOrDefault(right,0)+1);
    repeated = Math.max(repeated,map.get(right));

    if(end-start+1-repeated > k)
    {
      int left = arr[start];
      map.put(left,map.get(left) -1);
      start++;
    }
    length = Math.max(length,end-start+1);
  }
  return length;
  }
  
}
