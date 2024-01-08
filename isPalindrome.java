class Solution {
    public boolean isPalindrome(int x) {
        Integer y = new Integer(x);
        String num = y.toString();
        int j = num.length();
        for(int i=0;i<num.length();i++){
            // System.out.println(num.charAt(i));
            if(i==j || i>j){
                break;
            }
            else if(y==0){
                return true;
            }
            else if(y%10==0){
                return false;
            }            
            else if(num.charAt(i)==num.charAt(j-1)){
                --j;
            }
            else{
                return false;
            }
        }
        return true;
    
    }
}
