public class Palindrome {
    public static boolean isPalindrome(String str)
    {
        int midPoint = str.length() / 2;
        int lastInd = str.length() - 1;

        for (int i = 0; i < midPoint; i++)
        {
            if (str.charAt(i) != str.charAt(lastInd))
            {
                return false;
            }
            lastInd--;
        }
        return true;
    }

    //aabbaa

    public static void main (String args[])
    {
        System.out.println("Is it a palindrome: " + isPalindrome("aacbaa"));

    }
}