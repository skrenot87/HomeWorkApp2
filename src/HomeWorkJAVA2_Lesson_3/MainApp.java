package HomeWorkJAVA2_Lesson_3;

import java.util.HashMap;

public class MainApp {
    public static void main(String[] args) {
        String[] words = {
                "Fire", "World", "Peace", "Water", "Human", "Cucumber", "Pumpkin", "Meridian",
                "Fire", "World", "Cucumber", "Pumpkin", "Meridian", "Fire", "World", "Peace", "Water",
                "Human", "Cucumber", "Pumpkin", "Meridian", "World", "Peace", "Cat", "Dog", "Human",
                "Fire", "World", "Peace", "Cat", "Dog", "Human", "Cucumber", "Pumpkin", "Meridian"
        };

        HashMap<String, Integer> array = new HashMap<>();
        for (String word : words) {
            if (!array.containsKey(word)) {
                array.put(word, 1);
            } else {
                array.put(word, array.get(word) + 1);
            }
        }
        System.out.println(array);
    }
}
