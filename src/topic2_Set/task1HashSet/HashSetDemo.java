package topic2_Set.task1HashSet;

import java.util.HashSet;
import java.util.Set;

/**
 * нициализирует HashSet.
 * Добавляет несколько строк (например, "Apple", "Banana", "Orange", "Apple").
 * Выводит все уникальные значения, используя цикл for-each.
 */
public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple");
        hashSet.add("Orange");

        for (String set : hashSet){
            System.out.print(set + " ");
        }
    }
}
