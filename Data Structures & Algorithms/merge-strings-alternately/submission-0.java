class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l = 0;
        int r = 0;
        String merged = "";
        while(l <= word1.length() -1 || r <= word2.length() -1){
            if(l < word1.length()){
                merged += word1.charAt(l);
                l++;
            }
            if(r < word2.length()){
                merged += word2.charAt(r);
                r++;
            }
            
        }
        return merged;
    }
}