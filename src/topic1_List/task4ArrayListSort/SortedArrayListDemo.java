package topic1_List.task4ArrayListSort;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Инициализирует ArrayList и добавляет в него набор чисел (например, 42, 17, 8, 99, 23).
 * Сортирует список.
 * Выводит отсортированный список на экран.
 */
public class SortedArrayListDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(42);
        list.add(17);
        list.add(8);
        list.add(99);
        list.add(23);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
