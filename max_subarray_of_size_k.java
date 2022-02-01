/*
Given an array of positive numbers and a positive number ‘k,’ find the maximum sum of any contiguous subarray of size ‘k’.
*/



class MaxSumSubArrayOfSizeK {
  public static int findMaxSumSubArray(int k, int[] arr) {
    // TODO: Write your code here
    int windowStart=0;
    int maxSum=-1;
    int sum=0;
    for(int windowEnd=0; windowEnd<arr.length;windowEnd++){
      sum+=arr[windowEnd];
      if(windowEnd>=k-1){
        maxSum=Math.max(maxSum,sum);
        sum-=arr[windowStart];
        windowStart++;
      }
    }
    return maxSum;
  }
}
