public class Solution {
    public int solve_1(String A) {
        TreeSet<Character> se = new TreeSet<>();
        se.add('a'); se.add('e'); se.add('i'); se.add('o'); se.add('u');
        se.add('A'); se.add('E'); se.add('I'); se.add('O'); se.add('U');

        int n = A.length();
        long ans = 0;
        for(int i = 0; i < n; i++){
            if(se.contains(A.charAt(i))){
                ans += (n - i);
            }
        }
        return (int)(ans%10003);
    }

    public int solve_2(String A) {
        Set<Character> set = new HashSet<>();
        set.add('A');   set.add('E');   set.add('I');   set.add('O');   set.add('U');
        set.add('a');   set.add('e');   set.add('i');   set.add('o');   set.add('u');

        int mod = 10003;
        int answer = 0;
        int len = A.length();
        for(int i = 0; i < len; ++i){
            if(set.contains(A.charAt(i))){
                answer += (len - i);
                answer %= mod;
            }
        }

        return answer % mod;
    }
}