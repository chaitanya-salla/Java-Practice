import java.util.*;

public class DuplicateElements {
    public static void main(String[] args) {
        String[] names = {"JavaScript","Java", "Javascript", "Ruby", "C", "C++", "Java", "C"};

        // 1. Compare each element
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if(names[i].equals(names[j])) System.out.println(names[i]);
            }
        }

        // HashSet
        Set<String> stringSet = new HashSet<>(List.of(names));
        for(String name: names) {
            if(!stringSet.add(name))
                System.out.println(name);
        }

        // Removing Duplicate element
        System.out.println(new HashSet<>(Arrays.asList(names)));


        // HashMap
        Map<String , Integer> map = new HashMap<>();
        for (String name: names) {
            if (!map.containsKey(name)) {
                map.put(name, 1);
            } else {
                map.put(name, map.get(name)+1);
            }
        }
        System.out.println(map);

        for (Map.Entry<String,Integer>set: map.entrySet()){
            if(set.getValue() > 1) System.out.println(set.getKey());
        }



    }
}
