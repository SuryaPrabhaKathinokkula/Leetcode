// Last updated: 2/13/2026, 7:30:00 PM
1class Solution {
2    public int minOperations(int[] nums, int k) {
3        int sum=0;
4       
5        for(int i=0;i<nums.length;i++){
6            sum += nums[i];
7        }
8         
9        return sum%k;
10
11    }
12        
13    }
14