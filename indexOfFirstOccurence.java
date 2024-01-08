class Solution {
    public int strStr(String haystack, String needle) {
        Stack<Character> stack = new Stack<>();
        int j=0;
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(j)){
                stack.push(haystack.charAt(i));
                j++;
                if(stack.size()==needle.length()){
                    return i-j+1;
                }
            }else{
                stack.clear();
                // stack.push(haystack.charAt(i));
                j=0;
            }
        }
        return -1;
    }
}
