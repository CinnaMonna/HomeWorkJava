// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод(не void), который вернет “перевернутый” список.

package HW4;

import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        String[] ar = new String[]{"one", "two", "three", "four", "five"};
        LinkedList<String> lList = new LinkedList<>();
        for (String item : ar) {
            lList.add(item);
        }
        System.out.println("initial LinkedList: ");
        System.out.println(lList.toString());
        System.out.println("reversed LinkedList: ");
        System.out.println(ReversedList(lList));
    }
    
    static LinkedList<String> ReversedList(LinkedList<String> lList) {
        LinkedList<String> newLList = new LinkedList<>();
        for (String item : lList) {
            newLList.add(0, item);
        }
        return newLList;
    }
   
}
