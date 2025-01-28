public class Solution {
    public String solve(String A) {
        char[] ch = A.toCharArray();
        int n = A.length();

        for(int i = 0; i < n / 2; ++i){
            char temp = ch[i];
            ch[i] = ch[n - i - 1];
            ch[n - i - 1] = temp;
        }

        return new String(ch);
    }
}
