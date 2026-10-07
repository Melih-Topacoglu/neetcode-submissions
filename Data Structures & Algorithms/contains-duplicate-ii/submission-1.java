class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        for(int right = 1; right < nums.length; right++){
            int left = Math.max(right - k,0);
            while(right - left <= k && right != left){
                if(nums[left] == nums[right]){
                    return true;
                }
                left++;
            }
        }
        return false;
    }
}