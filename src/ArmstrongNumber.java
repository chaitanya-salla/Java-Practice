public class ArmstrongNumber {
    public static void main(String[] args) {
        // Armstrong Number -> Sum of quebes is equal to number


        System.out.println(isArmstrongNumber(153));
        System.out.println(isArmstrongNumber(121));
        System.out.println(isArmstrongNumber(407));
        System.out.println(isArmstrongNumber(0));
        System.out.println(isArmstrongNumber(1));
        System.out.println(isArmstrongNumber(371));
    }

    private static boolean isArmstrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (number > 0) {
            int lastNum = number % 10;
            sum += lastNum * lastNum * lastNum;
            number /= 10;
        }

        return sum == temp;
    }
}
