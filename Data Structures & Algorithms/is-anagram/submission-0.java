class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>smap = new HashMap<>();
        HashMap<Character,Integer>tmap = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            smap.merge(s.charAt(i), 1, Integer::sum);
            tmap.merge(t.charAt(i), 1, Integer::sum);
        }
        return smap.equals(tmap);
    }
}
