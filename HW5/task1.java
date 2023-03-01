// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 
//1) Добавление номера
//2) Вывод всего

package HW5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, LinkedList<String>> db = new HashMap<>();
        while (true) {
            System.out.println("Введите:\n1 - для добавления номера\n"+
                    "2 - для вывода телефонной книги\n0 - для выхода");

            int mode = sc.nextInt();
            sc.nextLine();

            if (mode == 1) {
                add(db);
            }
            else if (mode == 2) {
                output(db);
            }
            else if (mode == 0) {
                break;
            } else {
                System.out.println("Ошибка ввода");
            } 
            System.out.println();  
        }
        sc.close();
    }

    static void add(Map<String, LinkedList<String>> db) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> tel = new LinkedList<>();
        System.out.println("Введите фамилию:");
        String sur = sc.nextLine(); 
        boolean isDuplicate = false;
        if (db.containsKey(sur) == true) {
            System.out.println("Добавление номера для уже имеющегося в базе абонента:");
        }
        
        while (true){
            System.out.println("Введите номер:");
            String new_tel = sc.nextLine(); 
            if (db.containsKey(sur) == true) {
                isDuplicate = true;
                db.get(sur).add(new_tel);
            } else {
                tel.add(new_tel);
            }
            System.out.println();
            System.out.println("Добавить еще один номер для этого абонента?\n"+
                    "1 - да\n2 - нет");
            int mode = sc.nextInt();
            sc.nextLine();
            if (mode == 1) {
                continue;
            }
            else if (mode == 2) {
                break;
            } else {
                System.out.println("Ошибка ввода");
            } 
        }
        if (isDuplicate == false) {
            db.put(sur, tel);
        }


    }
    
    static void output(Map<String, LinkedList<String>> db) {
        System.out.println();
        if (db.isEmpty()) {
            System.out.println("Телефоная книга пуста");
        } else {
            for (var item: db.entrySet()) {
                System.out.println(item.getKey().toString() + ": " + item.getValue());
            }
            System.out.println();
        }

    }
}