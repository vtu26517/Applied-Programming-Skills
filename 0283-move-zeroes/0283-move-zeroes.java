class Solution {
    public void moveZeroes(int[] nums) {

        int index = 0; // position to place next non-zero

        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

        // fill remaining positions with 0
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
   
