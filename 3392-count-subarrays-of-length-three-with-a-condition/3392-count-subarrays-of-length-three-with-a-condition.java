class Solution {
    public int countSubarrays(int[] nums) {
        
        int count = 0;
        for(int r  = 2; r<nums.length; r++){
            if(2*(nums[r-2] + nums[r]) == nums[r-1]){
                count++;
            }
            
        }
        return count;
    }
}