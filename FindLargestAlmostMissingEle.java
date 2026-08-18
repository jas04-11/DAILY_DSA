class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int res = -1;
        for(int num : nums) {
            int cnt = 0;
            for(int i=0;i<=n-k;i++) {
                for(int j=i;j<i+k;j++) {
                    if(nums[j]==num) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt == 1) {
                res = Math.max(res, num);
            }
        }
        return res;
    }
}
