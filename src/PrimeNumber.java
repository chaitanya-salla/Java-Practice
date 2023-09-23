import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    // a number that can be divided exactly only by itself and 1, for example 7, 17 and 41
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(3));
        System.out.println(isPrimeNumber(2));
        System.out.println(isPrimeNumber(7));
        System.out.println(isPrimeNumber(13));
        System.out.println(isPrimeNumber(0));
        System.out.println(isPrimeNumber(-1));
        System.out.println(isPrimeNumber(41));
        getPrimeNumbers(41);
        getPrimeNumbers(37);
    }

    private static void getPrimeNumbers(int number) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i <= number; i++) {
            if (isPrimeNumber(i)) arr.add(i);
        }
        System.out.println(arr);
    }

    private static boolean isPrimeNumber(int number) {
        if(number <= 1) return false;
        for (int j = 2; j < number ; j++) {
            if(number % j == 0) return false;
        }
        return true;
    }


}
