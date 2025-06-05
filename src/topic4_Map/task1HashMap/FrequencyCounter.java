package topic4_Map.task1HashMap;
import java.util.HashMap;
import java.util.Map;

/**
 * Имеет массив строк, например: {"Apple", "Banana", "Apple", "Orange", "Banana", "Apple"}.
 * Использует HashMap<String, Integer> для подсчета, сколько раз встречается каждая строка.
 * Выводит результаты (каждая строка и её частоту) в консоль.
 */
public class FrequencyCounter {
    public static void main(String[] args) {

        String[] array = {"Apple", "Banana", "Apple", "Orange", "Banana", "Apple"};

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                int count = map.get(array[i]);
                count += 1;
                map.put(array[i], count);
            } else {
                map.put(array[i], 1);
            }
        }
        System.out.println(map.entrySet());
    }
}
