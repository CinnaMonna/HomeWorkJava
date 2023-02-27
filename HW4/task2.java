// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package HW4;

import java.util.LinkedList;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (lList.isEmpty()) {
            System.out.println("Очередь пуста");
            System.out.println(
                    "Введите:\n1 - чтобы поместить новый элемент в очередь\n" 
                    + "0 - выход");
            
            Integer num = sc.nextInt();
            sc.nextLine();
    
            if (num.equals(1)) {
                System.out.print("\nВведите элемент: ");
                String text = sc.nextLine();
                enqueue(lList, text);
                System.out.println("\nОчередь: ");
                System.out.println(lList.toString() + "\n");
            }
            else if (num.equals(0)) {
                break;
            } else { System.out.println("Ошибка ввода");}
            
            while (!lList.isEmpty()) {
                System.out.println(
                    "Введите:\n1 - чтобы поместить новый элемент в конец очереди\n" 
                    + "2 - чтобы возвратить первый элемент из очереди и удалить его\n" 
                    + "3 - чтобы возвратить первый элемент из очереди, не удаляя его\n"
                    + "0 - выход");
                
                num = sc.nextInt();
                sc.nextLine();
            
                if (num.equals(1)) {
                    System.out.print("\nВведите элемент: ");
                    String text = sc.nextLine();
                    enqueue(lList, text);
                    System.out.println("\nОчередь: ");
                    System.out.println(lList.toString() + "\n");
                } 
                else if (num.equals(2)) {
                    System.out.println("\nПервый элемент (удален): ");
                    dequeue(lList);
                    System.out.println("\nОчередь: ");
                    System.out.println(lList.toString() + "\n");
                }
                else if (num.equals(3)) {
                    System.out.println("\nПервый элемент (не удален): ");
                    first(lList);
                    System.out.println("\nОчередь: ");
                    System.out.println(lList.toString() + "\n");
                }
                else if (num.equals(0)) {
                    break;
                } else { System.out.println("Ошибка ввода");}       
            }
        }
        System.out.println("Конец работы");
        sc.close(); 
    }

    static void enqueue(LinkedList<String> lList, String text) {
        lList.add(text);
    }

    static void dequeue(LinkedList<String> lList) {
        System.out.println(lList.remove(0));
    }

    static void first(LinkedList<String> lList) {
        System.out.println(lList.get(0));
    }
    
}
