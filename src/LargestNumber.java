public class LargestNumber {
    public static void main(String[] args) {
        int[] numbers = {22,100, 9, 11, 7, -1, 10, 45, -2};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if(min > num) min = num;
            if(num > max) max = num;
        }
        System.out.println(min);
        System.out.println(max);

    }
}
