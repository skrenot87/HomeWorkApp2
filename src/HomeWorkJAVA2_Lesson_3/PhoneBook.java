package HomeWorkJAVA2_Lesson_3;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    private HashMap<String, HashSet<String>> map;

    public PhoneBook(HashMap<String, HashSet<String>> map) {
        this.map = map;
    }

    public void add(String surname, String phone) {
        if (map.containsKey(surname)) {
            map.put(surname, new HashSet<>());
        }
        map.get(surname).add(surname);
    }

    public HashSet<String> search(String surname) {
        if (!map.containsKey(surname)) {
            return new HashSet<>();
        } else {
            return map.get(surname);
        }
    }
}
