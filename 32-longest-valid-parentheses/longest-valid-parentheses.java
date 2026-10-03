class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        int open = 0;
        int close = 0;
        int res=0;

        //left to right - 
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='('){
                open++;
            }else{
                close++;
            }

            if(open==close){
                res = Math.max(res,close+open);

            }
            if(close>open){
                open=close=0;
            }
        }

        open = close = 0;
        //right to left - 
        for(int i=n-1; i>=0; i--){
            if(s.charAt(i)=='('){
                open++;
            }else{
                close++;
            }

            if(open==close){
                res = Math.max(res,close+open);

            }
            if(open>close){
                open=close=0;
            }
        }
        return res;

        
    }
}