class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] new_array = new int[2];
     for(int i = 0;i<nums.length-1;i++){
         
         for(int j = i+1;j<nums.length;j++){
             if(target-nums[i] == nums[j]){
                 new_array[0] = i;
                 new_array[1] = j;
                 
                 
             }
         }
     }   
     return new_array;
    }
}