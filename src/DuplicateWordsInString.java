import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {
    public static void main(String[] args) {
        String s = "Java is Java is best language!";

        String[] arr = s.split(" ");
        Set<String> set = new HashSet<>();
        for (String string : arr) {
            if (!set.add(string)) System.out.println(string);
        }

        Map<String, Integer> map = new HashMap<>();
        for (String word: arr) {
            if(map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        for(Map.Entry<String,Integer>entry :map.entrySet()) {
            if(entry.getValue() > 1) System.out.println(entry.getKey() + " is repeated " + entry.getValue() + " times.");
        }
    }
}
