class solution{
/*
    Input: A = "the sky is blue"
    Output: "blue is sky the"
 */
    public String solve_1(String A) {
        StringBuilder answer = new StringBuilder();
        Stack<String> stack = new Stack<>();
        int n = A.length();

        for(int i = 0; i < n; ++i){
            StringBuilder word = new StringBuilder();
            while(i < n && A.charAt(i) != ' '){
                word.append(A.charAt(i));
                i++;
            }

            if(word.length() == 0) continue;
            stack.push(word.toString());
        }

        while(!stack.isEmpty()){
            answer.append(stack.pop());
            if(!stack.isEmpty()) answer.append(" ");
        }

        return answer.toString();
    }

    public String solve_2(String A) {
        Stack<String> st = new Stack<>();
        for(int i=0;i<A.length();i++){
            String word="";
            while(A.charAt(i)!=' ' && i<A.length()){
                word+=A.charAt(i);
                i++;
            }
            if(word.equals("")){
                continue;
            }
            st.push(word);
        }
        String ans="";
        while(!st.empty()){
            ans+=st.peek();
            st.pop();

            if(st.empty()){
                continue;
            }
            ans+=" ";
        }
        return ans;
    }
}