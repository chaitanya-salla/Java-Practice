public class SwapStrings {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";

        // Append
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.replaceAll(b, "");
        System.out.println(a);
        System.out.println(b);

    }
}
