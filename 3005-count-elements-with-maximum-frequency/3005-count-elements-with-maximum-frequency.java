class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int el = 0;
        int freq = 0;
        for(int val : map.values()){
            if(val >= freq){
                freq = val;
            }
        }
        for(int val : map.values()){
            if(val == freq){
                el += val;
            }
        }
        return el;
    }
}