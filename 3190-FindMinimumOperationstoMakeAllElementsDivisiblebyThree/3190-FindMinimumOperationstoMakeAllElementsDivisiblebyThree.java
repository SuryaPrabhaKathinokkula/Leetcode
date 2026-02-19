// Last updated: 2/19/2026, 4:22:01 PM
1class Solution {
2    public int minimumOperations(int[] nums) {
3     int operations=0;
4     for(int i=0;i<nums.length;i++){
5        int remainder= nums[i]%3;
6        if(remainder !=0){
7            operations+=1;
8        }
9     }
10     return operations;
11     
12    }
13}