// 3. Напишите метод, который принимает на вход строку (String) 
// и определяет является ли строка палиндромом (возвращает boolean значение).

package HW2;

import java.lang.StringBuilder;

public class task3 {
    public static void main(String[] args) {
        String a = "potop";
        String b = "шалаш";
        String c = "A2332A";
        String d = "not_pal";
        System.out.print(a + " - ");
        System.out.println(isPalindrom(a));
        System.out.print(b + " - ");
        System.out.println(isPalindrom(b)); 
        System.out.print(c + " - ");
        System.out.println(isPalindrom(c)); 
        System.out.print(d + " - ");
        System.out.println(isPalindrom(d));     
    }

    static boolean isPalindrom(String str) {
        StringBuilder strB = new StringBuilder(str);
        int len = strB.length();
        String half2 = strB.substring(len - len / 2);
        strB.setLength(len / 2);
        String half1 = strB.reverse().toString();
       
        return half1.equals(half2);
        
    }
    
}
