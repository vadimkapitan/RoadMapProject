package topic1_List.task1ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Инициализирует ArrayList.
 * Добавляет в него несколько чисел.
 * Удаляет один из элементов (например, число 20).
 * Перебирает элементы с помощью цикла for-each.
 * Выводит оставшиеся элементы на экран.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(13);
        arrayList.add(20);
        arrayList.add(33);
        arrayList.add(44);
        arrayList.add(55);
        arrayList.remove(Integer.valueOf(20));
        for(Integer arr : arrayList){
            System.out.print(arr + " ");
        }
    }
}
