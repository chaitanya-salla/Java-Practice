import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Chaithanya";
        StringBuilder rev = new StringBuilder();
        for (int i = name.length() - 1; i >= 0; i--) {
            rev.append(name.charAt(i));
        }

        System.out.println(rev);
        System.out.println(new StringBuffer(name).reverse());
    }
}
