package topic2_Set.task2TreeSet;

import java.util.Set;
import java.util.TreeSet;
/**
 * Инициализирует TreeSet.
 * Добавляет в него набор чисел в произвольном порядке (например, 50, 20, 40, 10, 30).
 * Выводит элементы на экран, демонстрируя, что они отсортированы по возрастанию.
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(50);
        set.add(20);
        set.add(40);
        set.add(10);
        set.add(30);
        System.out.println(set);
    }
}
