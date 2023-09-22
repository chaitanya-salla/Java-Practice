public class RemoveJunk {
    public static void main(String[] args) {
        String s = "你好你好 latin string 01234567890";


        // Use Regular Expression[^a-zA-Z0-9]
        System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
        System.out.println(s.replaceAll("[^a-zA-Z]", ""));
        System.out.println(s.replaceAll("[^你好你好]", ""));
        System.out.println(s.replaceAll("[你好你好]", "").trim());


    }
}
