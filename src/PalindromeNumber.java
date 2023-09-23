public class PalindromeNumber {

    // revered number is equal to original ex- 151, 141

    public static void main(String[] args) {
        System.out.println(isPalindrome(141));
        System.out.println(isPalindrome(151));
        System.out.println(isPalindrome(1234));
        System.out.println(isPalindrome(-1));
        System.out.println(isPalindrome(0));
    }

    private static boolean isPalindrome(int number) {
        int temp = number;
        int rev = 0;
        while (number > 0){
            rev = rev * 10 + number % 10;
            number = number / 10;
        }
        return rev == temp;
    }
}
