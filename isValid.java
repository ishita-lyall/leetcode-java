class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.peek();
                char ch = s.charAt(i);
                 if((ch==')' && top=='(' )||(ch==']' && top=='[' )|| (ch=='{' && top=='}'))
                 {
                     stack.pop();
                 }
                 else
                 {
                     return false;
                 }


            }

        }
        return true;
    }
}



// class Solution {
//     public boolean isValid(String s) {
//         int count1 = 0;
//         int count2 = 0;
//         int count3 = 0;
//         for(int i =0;i<s.length();i++){
//             switch(s.charAt(i)){
//             case '(':
//             count1++;
//             break;
//             case '[':
//             count2++;
//             break;
//             case '{':
//             count3++;
//             break;
//             case ')':
//             count1--;
//             break;
//             case ']':
//             count2--;
//             break;
//             case '}':
//             count3--;
//             break;
//             }                                                            

//         }
//         if(count1==0 || count2==0 || count3==0){
//             return true;
//         }else{
//             return false;
//         }

//     }
// }
