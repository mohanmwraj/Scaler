public class Solution {
    public String solve_1(String A, int B) {
        char[] ch = A.toCharArray();
        int len = A.length();
        int count = 0;
        for(int start = 0; count < len; ++start){
            int current = start;
            char prev = ch[start];
            do{
                int next = (current + B) % len;
                char temp = ch[next];
                ch[next] = prev;
                prev = temp;
                current = next;
                count++;

            }while(current != start);
        }

        return new String(ch);
    }
    public String solve_2(String A, int B) {
//         String res = null;

//         if((A==null)||B==0)
//             return A;

//         for(int i = 0; i<B;i++)
//         {
//             char temp = A.charAt(0);
//             res = A.substring(1, A.length()) + temp;
//         }

        // return solve(A, A.length()-B);
        StringBuilder sb = new StringBuilder(A);
        int a = A.length();

        if(B==0)
            return A;

        int s = B%a;

        for( int i = 0; i<s; i++)
        {
            char ch = sb.charAt(a-1);
            sb.insert(0, ch);
            sb.deleteCharAt(a);

        }

        // for(int i = 0; i<a ; i++)
        // {
        //     if(i<B)
        //         sb.append(A.charAt(i));
        //     else
        //         sb.insert(i-B, A.charAt(i));
        // }

        return sb.toString();


    }
}
