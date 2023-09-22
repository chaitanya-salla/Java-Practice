public class MissingNumber {

    public static void main(String[] args) {
        // Declare an array
//       int[] arr; // int arr[]
//        arr = new int[20]; // allocated memory to an array

        // Declaring array literal
//        int[] intArray = {1,2,3,4,6}; // int[] arr = new int[]{1,2,3,4,5,6}


        int[] arr = {-1,0,1,2,4,5,6,7};  // 3 is missing

        /*
        Solution - add 1+2+4+5 = 12
        Add actual number - 1+2+3+4+5 = 15
        15-12  = 3
         */
        int total = 0;
        for (int num : arr) {
            total += num;
        }

        int total1 = 0;



        for (int i = arr[0]; i <= arr[arr.length - 1]; i++) {
            total1 += i;
        }

        System.out.println(total1 - total);
    }
}
