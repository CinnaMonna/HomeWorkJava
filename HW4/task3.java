// В калькулятор добавьте возможность отменить последнюю операцию.
package HW4;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Double> firstNum = new LinkedList<>();
        
        System.out.print("первое число: ");
        double num1 = sc.nextDouble();
        firstNum.addFirst(num1);
        sc.nextLine();

        System.out.print("действие (+ - / *): ");
        String act = sc.nextLine();

        System.out.print("второе число: ");
        double num2 = sc.nextDouble();
        sc.nextLine();

        System.out.println("результат: " + result(num1, num2, act));
        
        while (true){
            num1 = result(num1, num2, act);
            firstNum.addLast(num1);
            // System.out.println(firstNum.toString());

            System.out.print("действие (+ - / *) или шаг назад (b) или выход (q): ");
            act = sc.nextLine();

            if (act.equals("b")){
                firstNum.removeLast();
                num1 = firstNum.getLast();
                System.out.println("первое число: " + num1);
                System.out.print("действие (+ - / *): ");
                act = sc.nextLine();
            }
            else if (act.equals("q")){ break; }

            System.out.print("второе число: ");
            num2 = sc.nextDouble();
            sc.nextLine();

            System.out.println("результат: " + result(num1, num2, act));

        }
        sc.close();
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

    

