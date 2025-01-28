public class Solution {
    public int solve(String A, int B) {
        HashMap<String, Integer> hm = new HashMap();
        int stringLength = A.length();

        int largetSubstringLength = 0;
        String largetSubstring = "NULL";


        if(stringLength<B)
            return 0;

        if(stringLength==B)
            return 1;

        for (int i = 0; i < stringLength; i++)
            for (int j = i+1; j <= stringLength; j++)
            {
                String s1 = A.substring(i, j);
                hm.put(s1,(hm.get(s1) == null?1:hm.get(s1)+1));
                if(s1.length()>largetSubstringLength && hm.get(s1)>=B)
                {
                    largetSubstringLength = s1.length();
                    largetSubstring = s1;

                }
            }

        return largetSubstringLength;
    }
    public class Solution {
        public int solve_2(String A, int B) {
            int len = A.length();
            if(len < B) return 0;
            if(len == B) return 1;

            Map<String, Integer> map = new HashMap<>();
            int answer = 0;
            String largestSubString = null;

            for(int i = 0; i < len; ++i){
                for(int j = i + 1; j <= len; ++j){
                    String s1 = A.substring(i, j);
                    map.put(s1, map.getOrDefault(s1, 0) + 1);

                    if(s1.length() > answer && map.get(s1) >= B){
                        largestSubString = s1;
                        answer = s1.length();
                    }
                }
            }
            return answer;
        }
    }
}