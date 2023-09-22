import java.util.Arrays;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "The rains have started here selenium";
        String str1 = "The Rains have started here selenium";

        // Length
        System.out.println("Length of String " + str.length());

        // At Position 5
        System.out.println("Character at  5th position " + str.charAt(5));

        // Index of First S
        int index = str.indexOf('h');
        System.out.println("Index of First h " + index);

        // Index of second s
        int second = str.indexOf('h', index + 1);
        System.out.println("Second Index at " + second);

        // Index of third s
        int third = str.indexOf('h', second + 1);
        System.out.println("Third Index at " + third);


        // String Comparison
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));

        // Substring
        System.out.println(str.substring(0,str.length()));

        //String Replace
        System.out.println("01-01-2017".replaceAll("-", "/"));

        // Split
        String[] arr = "Hello_World_Java".split("_");
        System.out.println(Arrays.toString(arr));
    }

}
