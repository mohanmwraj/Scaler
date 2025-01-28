public class Solution {
    public boolean check_1(String s) {
        boolean ok = true;
        for (int i = 0; i + 1 < s.length(); ++i)
            ok &= (Math.abs(s.charAt(i) - s.charAt(i + 1)) != 1);
        return ok;
    }
    public int solve_1(String A) {
        String odd = "", even = "";
        // odd and even stores odd and even characters respective
        for (int i = 0; i < A.length(); ++i) {
            char c = A.charAt(i);
            if (c % 2 == 0)
                odd += c;
            else
                even += c;
        }
        char[] ar = odd.toCharArray();
        Arrays.sort(ar);
        odd = String.valueOf(ar);
        ar = even.toCharArray();
        Arrays.sort(ar);
        even = String.valueOf(ar);
        // check if either (odd + even) or (even + odd) has no boring substrings
        if (check(odd + even))
            return 1;
        else if (check(even + odd))
            return 1;
        return 0;
    }

    public int solve_2(String A) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for(int i = 0; i < A.length(); ++i){
            if(A.charAt(i) % 2 == 0){
                even.append(A.charAt(i));
            } else {
                odd.append(A.charAt(i));
            }
        }
        char[] charArray = new char[odd.length()];
        odd.getChars(0, odd.length(), charArray, 0);
        Arrays.sort(charArray);

        String oddString = String.valueOf(charArray);

        charArray = new char[even.length()];
        even.getChars(0, even.length(), charArray, 0);
        Arrays.sort(charArray);

        String evenString = String.valueOf(charArray);

        if(check(oddString + evenString)) return 1;
        else if(check(evenString + oddString)) return 1;

        return 0;
    }

    private boolean check_2(String str){
        boolean ok = true;

        for(int i = 0; i < str.length() - 1; ++i){
            ok &= (Math.abs(str.charAt(i) - str.charAt(i + 1)) != 1);
        }

        return ok;
    }
}

