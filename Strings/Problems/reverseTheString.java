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
    public String solve_3(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder buf = new StringBuilder();

        for(int i = s.length()-1; i>=0; i--)
        {
            char c = s.charAt(i);
            if(c!=' ') buf.append(c);
            else create(res, buf);
        }

        create(res, buf);
        return res.toString();
    }

    private void create(StringBuilder res, StringBuilder buf)
    {
        int i = buf.length()-1;

        while(i>=0){
            if(i==buf.length()-1 && res.length()>0) res.append(' ');
            res.append(buf.charAt(i));
            i--;
        }
        buf.setLength(0);
    }

    public String solve_4(String s) {
        int len = s.length();
        if(len == 1) return s;

        StringBuilder answer = new StringBuilder();
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; ++i){
            char ch = s.charAt(i);
            if(ch == ' '){
                if(sb.length() != 0) stack.push(sb.toString());
                sb.setLength(0);
                continue;
            }

            sb.append(ch);
        }

        while(!stack.isEmpty()){
            answer.append(stack.pop());
            if(!stack.isEmpty()) answer.append(" ");
        }

        return answer.toString();
    }
}