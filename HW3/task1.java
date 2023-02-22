// Пусть дан произвольный список целых чисел, 
// удалить из него четные числа

package HW3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        RandomList(list, 10, 100);
        
        System.out.println("initial list:");
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.print(list.get(i) + " ");
        // }
        for (int item : list) {
            System.out.print(item + " ");
        }
        System.out.println();

        EvenRemoveList1(list);
        System.out.println("list with even numbers removed (without Iterator):");
        for (int item : list) {
            System.out.print(item + " ");
        }
        System.out.println();

        EvenRemoveList2(list);
        System.out.println("list with even numbers removed (with Iterator):");
        for (int item : list) {
            System.out.print(item + " ");
        }
        System.out.println();

    }

    static void RandomList (LinkedList<Integer> list, int number, int maxVal) {
        Random rand = new Random();
        for (int i = 0; i < number; i++) {
            list.add(rand.nextInt(maxVal));
        }
    
    }

    static void EvenRemoveList1 (LinkedList<Integer> list) { // без итератора
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
    }

    static void EvenRemoveList2 (LinkedList<Integer> list) { // с итератором
        Iterator<Integer> iter = list.iterator();

        while (iter.hasNext()) {
            if (iter.next() % 2 == 0) {
                iter.remove();
            }
        } 
    }

}
