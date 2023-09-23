public class SwapNumbers {
    public static void main(String[] args) {
        int x= 5, y= 10;

        // With third variable
//        int temp;
//        temp = x;
//        x = y;
//        y = temp;
//        System.out.println("X : " + x);
//        System.out.println("Y : " + y);

        // Without Third variable

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x);
        System.out.println(y);

    }
}
