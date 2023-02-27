class Solution {
    public boolean isPalindrome(int x) {
        String value = String.valueOf(x);
        Stack<Character> my_stack = new Stack<Character>();
        for(int i = 0;i<value.length();i++){
            my_stack.push(value.charAt(i));
        }
        for(int i = 0;i<value.length();i++){
            if(value.charAt(i)!=my_stack.pop()){
                return false;
            }
        }
        return true;
    }
}