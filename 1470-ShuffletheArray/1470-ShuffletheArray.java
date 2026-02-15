// Last updated: 2/15/2026, 10:12:33 PM
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int[] result=new int[2*n];
4        for(int i=0;i<n;i++){
5        result[2 * i] = nums[i];     
6         result[2 * i + 1] = nums[i + n];
7
8        }
9        return result;
10        
11    }
12}