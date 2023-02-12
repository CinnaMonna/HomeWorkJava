// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// а так же n! (произведение чисел от 1 до n)

package HW1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        
        System.out.print("input integer number: ");    
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        System.out.print("sum of numbers from 1 to n is: ");
        System.out.println(sum(num));  

        System.out.print("product of numbers from 1 to n is: ");
        System.out.println(fact(num)); 
    }

    public static int sum(int num) {
        if (num == 1) return 1;
        return num + sum(num - 1);
    }
    public static long fact(int num) {
        if (num == 1) return 1;
        return num * fact(num - 1);
    }
}
