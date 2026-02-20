// Last updated: 2/20/2026, 8:27:32 PM
1class Solution {
2    public int findNumbers(int[] nums) {
3        int evenCount=0;
4        for(int x:nums){
5            int digitCount=String.valueOf(x).length();
6            if(digitCount%2==0){
7                evenCount+=1;
8            }
9        }
10        return evenCount;
11        
12    }
13}