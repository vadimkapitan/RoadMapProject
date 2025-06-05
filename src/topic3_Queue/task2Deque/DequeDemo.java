package topic3_Queue.task2Deque;
import java.util.Deque;
import java.util.LinkedList;
/**
 * Инициализирует объект Deque<Integer> с использованием LinkedList.
 * Добавляет несколько чисел с помощью методов addFirst() и addLast().
 * Удаляет элементы с помощью методов pollFirst() и pollLast().
 * Перебирает и выводит оставшиеся элементы очереди.
 */
public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(5);
        deque.addFirst(3);
        deque.addFirst(2);
        deque.addLast(1);
        deque.addLast(7);
        deque.addLast(4);

        for (Integer numbers : deque){
            System.out.print(numbers + " ");
        }

        System.out.println();

        deque.pollFirst();
        deque.pollLast();

        for (Integer numbers : deque){
            System.out.print(numbers + " ");
        }

        System.out.println();

        deque.pollFirst();
        deque.pollLast();

        for (Integer numbers : deque){
            System.out.print(numbers + " ");
        }
    }
}
