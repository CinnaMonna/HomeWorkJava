// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее ариф. из этого списка
package HW3;

import java.util.ArrayList;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        RandomList(list, 10, 100);
        System.out.print("list:  ");
       
        for (int item : list) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("min value is: " + MinInList(list));
        System.out.println("max value is: " + MaxInList(list));
        System.out.println("average is: " + AverageInList(list));   
    }
    
    static void RandomList (ArrayList<Integer> list, int number, int maxVal) {
        Random rand = new Random();
        for (int i = 0; i < number; i++) {
            list.add(rand.nextInt(maxVal));
        }
    
    }

    static Integer MinInList (ArrayList<Integer> list) {
        Integer min = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
            
        }
        return min;
    }

    static Integer MaxInList (ArrayList<Integer> list) {
        Integer max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
            
        }
        return max;
    }

    static Double AverageInList (ArrayList<Integer> list) {
        Double av = 0.0;

        for (int value : list) {av += value;}
        av /= list.size();
        return av;
    }
}
