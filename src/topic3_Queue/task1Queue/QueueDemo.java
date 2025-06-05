package topic3_Queue.task1Queue;
import java.util.LinkedList;
import java.util.Queue;
/**
 * Инициализирует объект Queue<String> (реализованный через LinkedList).
 * Добавляет несколько строк (например, "A", "B", "C") с помощью метода offer().
 * Извлекает элементы очереди с помощью метода poll() и выводит их.
 * Использует метод peek() для просмотра первого элемента очереди без удаления.
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println(queue.peek());

        while (!queue.isEmpty()) {
            System.out.println("Извлекаем элемент: " + queue.poll());
        }
    }
}
