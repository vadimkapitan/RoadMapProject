package topic4_Map.task1HashMapIter;

import java.util.HashMap;
import java.util.Map;

/**
 * Инициализирует HashMap<String, Integer> с данными студентов и их баллов.
 * Добавляет несколько записей (например, "Alice" → 85, "Bob" → 72, "Charlie" → 90, "Diana" → 68).
 * Перебирает карту и выводит имена студентов, у которых баллы выше 75.
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Alice", 85);
        students.put("Bob", 72);
        students.put("Char Lie", 90);
        students.put("Diana", 68);

        int points = 75;

        System.out.println("Список учащихся с баллом выше: " + points);

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            if (entry.getValue() > points) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}

