public class Solution {
    public int solve(String A) {
        int answer = 0;
        for(int i = 0; i + 2 < A.length(); ++i){
            if(A.charAt(i) == 'b' && A.charAt(i + 1) == 'o' && A.charAt(i + 2) == 'b'){
                answer++;
            }
        }

        return answer;
    }
}