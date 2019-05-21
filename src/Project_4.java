public class Project_4 {
    public static void main(String[] args) {
        String sNum;
        String rsNum;
        int palindrome;
        int largestPalindrome = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                palindrome = i * j;
                sNum = String.valueOf(palindrome);
                rsNum = "";
                for (int k = sNum.length() - 1; k >= 0; k--) {
                    rsNum += sNum.substring(k, k + 1);
                }
                if (sNum.equals(rsNum) && palindrome > largestPalindrome) {
                    largestPalindrome = palindrome;
                }
            }
        }
        System.out.println(largestPalindrome);
    }
}