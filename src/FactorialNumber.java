public class FactorialNumber {

    // The factorial of a number is the product of all the integers from 1 to that number.
    // For example, the factorial of 6 is 1*2*3*4*5*6 = 720
    public static void main(String[] args) {
//        System.out.println(factorialNumber(3));
//        System.out.println(factorialNumber(4));
//        System.out.println(factorialNumber(6));
//        System.out.println(factorialNumber(5));
//        System.out.println(factorialNumber(0));
//        System.out.println(factorialNumber(1));
        System.out.println(factorialNumberRecursion(6));
        System.out.println(factorialNumberRecursion(-23));
    }

    private static int factorialNumberRecursion(int number) {
        return number <= 1 ? 1 : number * factorialNumberRecursion(number - 1);
    }

    private static int factorialNumber(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }





}
