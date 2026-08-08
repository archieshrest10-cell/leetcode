class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0;
        int i = 0;
        while (i < nums.length) {
           if (nums[i] != val) {
              c++;
           }
         i++;     
        }
        i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                
                nums[i]=nums[j];
                i++;
            }
           
        }
        return c;
    }
}