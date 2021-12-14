class Solution {
    public findSmallest(int[] nums) {

        for(int i=0;i<nums.length;i++) {
            int key = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > key) {
                arr[j + 1] = nums[j];
                j = j - 1;
            }
            
            nums[j + 1] = key;
        }

        int least = 1;
        
        for(int i=0;i<nums.length - 1;i++) {
            if(nums[i] >= 0) {
                if(nums[i+1] > nums[i] + 1) return nums[i]+1;
            }
        }
    }
}