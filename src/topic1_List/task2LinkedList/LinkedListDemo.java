package topic1_List.task2LinkedList;

import java.util.LinkedList;
import java.util.List;

/**
 * Инициализирует LinkedList.
 * Добавляет элементы (например, "One", "Two", "Three").
 * Использует методы addFirst() и addLast() для добавления элементов в начало и конец.
 * Удаляет элементы с помощью removeFirst() и removeLast().
 * Выводит оставшиеся элементы с помощью цикла for-each.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");
        System.out.println(linkedList);
        linkedList.addFirst("Zero");
        linkedList.addLast("Four");
        System.out.println(linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        for (String e : linkedList){
            System.out.print(e + " ");
        }
    }
}
