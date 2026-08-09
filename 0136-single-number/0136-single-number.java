class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        int count[] = new int[len];

        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(i != j && nums[i] == nums[j]) {
                    count[i]++;
                }
            }

            if(count[i] == 0) {
                return nums[i];
            }
        }

        return 0;
    }
}