class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longest = "";
        String first = strs[0];
        for(int i = 0; i < first.length(); i++){

            for(String string : strs){
                if(i >= string.length() || first.charAt(i) != string.charAt(i)){
                    return longest;
                }
            }
            longest += first.charAt(i);
        }
        return longest;
    }
}