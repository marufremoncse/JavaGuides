public class CheckPalindromeString {
    int isPalindrome(String S) {
        // code here
        int l = 0, r = S.length() - 1;

        while(l<r){
            if(S.charAt(l++)!=S.charAt(r--)){
                return 0;
            }
        }

        return 1;
    }
}
