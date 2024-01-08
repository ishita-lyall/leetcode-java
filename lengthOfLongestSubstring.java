class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int current = set.size();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);

            if(!set.contains(c)){
                set.add(c);
            }else{
                max = Math.max(max, set.size());
                current = Math.max(max, current);
                set.clear();
                set.add(c);
            }

        }
        return current;
        
    }
}
