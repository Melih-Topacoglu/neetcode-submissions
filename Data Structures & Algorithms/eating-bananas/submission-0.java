class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        int middle = 0;
        for(int num : piles){
            if(num > high){
                high = num;
            }
        }
        while(low <= high){
            int hour = 0;
            middle = low + (high - low) / 2;
            for(int num : piles){
                hour+=(num + middle - 1) / middle;
            }
            if(hour <= h){
                high = middle - 1;
            }else{
                low = middle + 1;
            }
        }
        return low;
    }
}
