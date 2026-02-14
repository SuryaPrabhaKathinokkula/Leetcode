// Last updated: 2/14/2026, 11:28:08 PM
1class Solution {
2    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
3        int result=0;
4        for(int i=0;i<hours.length;i++){
5            if(hours[i]>=target){
6               result+=1;
7            }
8        }
9        return result;
10    }
11}