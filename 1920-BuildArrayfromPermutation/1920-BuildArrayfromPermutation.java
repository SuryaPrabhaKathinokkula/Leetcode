// Last updated: 9/23/2025, 6:01:26 PM
class Solution {
    public int[] buildArray(int[] nums) 
    {
        int[] ans=new int[nums.length];
        int x;
        for(int i=0;i<nums.length;i++)
        {
            x=nums[i];
            ans[i]=nums[x];
        }
        return ans;
        
    }
}