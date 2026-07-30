/*Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 */

class Solution {
    public void moveZeroes(int[] nums) {
       int start=0;
       
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            int temp=nums[i];
            nums[i]=nums[start];
            nums[start]=temp;
            start++;
        }
       } 
    }
}
