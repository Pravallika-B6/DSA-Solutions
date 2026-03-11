class Solution {
    public void sortColors(int[] nums) {
        int temp;
        int minIndex = 0;
        for(int i=0; i<nums.length; i++){
            minIndex = i;
            for(int j=i+1; j<nums.length; j++){
            if(nums[j]<nums[minIndex]){
                    minIndex = j;
                }
            }
                temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
                
        }
    }
}
