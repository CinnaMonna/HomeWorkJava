// Вывести все простые числа от 1 до 1000

package HW1;

public class task2 {
    public static void main(String[] args) {
        int count = 0;
        int minVal = 1;
        int maxVal = 1000;

        for (int val = minVal; val <= maxVal; val++) {
            for (int divisor = 1; divisor <= val; divisor++) {
                if (val % divisor == 0) {
                    count += 1;
                }    
            }
            if (count == 2) {
                System.out.printf("%d  ", val);
            }
            count = 0;
        } 
    }
}
