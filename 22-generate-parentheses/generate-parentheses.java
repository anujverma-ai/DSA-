class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>answer = new ArrayList<>();
        generate("",n,answer);

        return answer;
    }

        // generate all possible pairs 

        void generate(String current , int n , List<String>answer){
            // when a valid length forms
            if(current.length()== 2*n){
                if(isvalid(current)){
                    answer.add(current);
                }

                return;
            }
            // add "("
            generate(current+"(" , n , answer);
            // add ")"
            generate(current+")" , n , answer);
        }

        boolean isvalid(String str){
            int bal=0;
            for(int i=0 ; i<str.length(); i++){
                if(str.charAt(i)=='('){
                    bal++;
                }else{
                    bal--;
                }
                if(bal<0){
                    return false;
                }
            }
            return bal==0;
        }
}