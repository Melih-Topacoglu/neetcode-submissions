class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxCount = 0;
        int majority = 0;
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }else{
                map.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                majority = entry.getKey();
            }
        }
        return majority;
    }
}