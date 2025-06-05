package topic1_List.task3Stack;

import java.util.Stack;

/**
 * Инициализирует объект Stack<String>.
 * Добавляет несколько строк (например, "First", "Second", "Third") с помощью метода push().
 * Использует метод peek() для просмотра верхнего элемента стека.
 * Извлекает и выводит элементы из стека с помощью метода pop() до его опустошения.
 */
public class StackDemo {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println(stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Извлечен элемент: " + stack.pop());
        }
    }
}
