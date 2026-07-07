class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char ch: s.toCharArray()){
            if(ch =='[' || ch =='(' || ch =='{'){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    char c = stack.pop();
                    if(ch==')' && c!='(' || ch==']' && c!='[' || ch=='}' && c!='{'){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
