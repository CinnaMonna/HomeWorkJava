// Реализовать простой калькулятор (+ - / *)
//ввод:
//число1
//знак
//число2
//вывод: выражение = результат

package HW1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("first number: ");
        double num1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("action (+ - / *): ");
        String act = sc.nextLine();

        System.out.print("second number: ");
        double num2 = sc.nextDouble();

        sc.close();

        System.out.printf("%f %s %f = %f", num1, act, num2, result(num1, num2, act));

    }

    public static double result(double num1, double num2, String act) {
        double res = 0;
        switch(act) {
            case "+": res = num1 + num2;
                break;
            case "-": res = num1 - num2;
                break;
            case "*": res = num1 * num2;
                break;
            case "/": res = num1 / num2;
                break;
        }
        return res;
    }   
}
