

public class Solution {
    public String longestCommonPrefix(ArrayList < String > A) {
        if (A.size() == 0)
            return "";
        String str;
        String res = "";
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.size(); i++) {
            min = Math.min(min, A.get(i).length());
        }
        for (int i = 0; i < min; i++) {
            char c = A.get(0).charAt(i);
            // check if c character is same in every string or not
            for (int j = 1; j < A.size(); j++) {

                if (c != A.get(j).charAt(i))
                    return res;
            }
            res += c;
        }
        return res;
    }
    public String longestCommonPrefix_2(ArrayList<String> A) {
        int len = A.size();
        if(len == 0) return " ";

        StringBuilder answer = new StringBuilder();
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < len; ++i){
            min = Math.min(min, A.get(i).length());
        }

        for(int i = 0; i < min; ++i){
            char ch = A.get(0).charAt(i);
            for(int j = 1; j < len; ++j){
                if(ch != A.get(j).charAt(i)) return answer.toString();
            }
            answer.append(ch);
        }
        return answer.toString();
    }

    public String longestCommonPrefix_3(String[] A) {

        int size = A.length;

        if (size == 0)
            return "";

        if (size == 1)
            return A[0];

        Arrays.sort(A);

        int end = Math.min(A[0].length(), A[size-1].length());

        int i = 0;
        while (i < end && A[0].charAt(i) == A[size-1].charAt(i) )
            i++;

        String pre = A[0].substring(0, i);
        return pre;


    }
}

