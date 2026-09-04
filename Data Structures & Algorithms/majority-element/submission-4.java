class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;
        int i = 0;
        while (i < nums.length) {
            if(candidate == nums[i]) {
                count++;
            } else {
                if(count > 0) count--;
                if(count == 0) {
                    candidate = nums[i];
                    count = 1;
                }
            }
            i++;
        }

        return candidate;
    }
}