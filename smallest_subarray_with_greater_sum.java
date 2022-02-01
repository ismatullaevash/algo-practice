/*
Given an array of positive numbers and a positive number ‘S,’ find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. 
Return 0 if no such subarray exists.
*/


class MinSizeSubArraySum {
  public static int findMinSubArray(int S, int[] arr) {
    // TODO: Write your code here
    int start = 0;
    int min = Integer.MAX_VALUE;
    int sum = 0;
    for(int end = 0; end < arr.length; end++)
    {
      sum += arr[end];
      while (sum >= S)
      {
        min = Math.min(min, end - start +1);
        sum -= arr[start];
        start++;
      }
    }
    return min == Integer.MAX_VALUE ? 0 : min;
  }
}
