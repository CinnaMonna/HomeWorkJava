import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру. 
//Критерии фильтрации можно хранить в Map. 
// NoteBook notebook1 = new NoteBook 
// NoteBook notebook2 = new NoteBook 
// NoteBook notebook3 = new NoteBook 
// NoteBook notebook4 = new NoteBook 
// NoteBook notebook5 = new NoteBook
// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет
// Далее нужно запросить критерии - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
// Класс сделать в отдельном файле
// Пример: ----->
// приветствие
// Выбор параметра:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет
// выбор конкретнее
// 1 ---> Введите кол-во ---> 16
// вывод всех подходящих ноутбуков по параметру

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");

        Notebook notebook1 = new Notebook("8 Gb", "256 Gb", "Windows", "Silver"); 
        Notebook notebook2 = new Notebook("16 Gb", "512 Gb", "Windows", "Black");
        Notebook notebook3 = new Notebook("16 Gb", "1 Tb", "MacOS", "White"); 
        Notebook notebook4 = new Notebook("32 Gb", "1 Tb", "Windows", "White"); 
        Notebook notebook5 = new Notebook("32 Gb", "2 Tb", "MacOS", "Silver");  

        LinkedList<Notebook> list = new LinkedList<>(Arrays.asList(notebook1, notebook2, notebook3, notebook4, notebook5));

        service(list);
        sc.close();
    }
   
    static void service(LinkedList<Notebook> list) {
        System.out.println("\nВы воспользовались сервисом подбора ноутбука по параметрам.\n" +
        "\nВведите цифру для выбора параметра фильтрации:\n" +
        "1 - Объем ОЗУ\n" +
        "2 - Объем жесткого диска\n" +
        "3 - Операционная система\n" +
        "4 - Цвет");

        Integer choice1 = readChoice();
        
        if (choice1 == 1) filterRam(list);
        else if (choice1 == 2) filterHdd(list);
        else if (choice1 == 3) filterOs(list);
        else if (choice1 == 4) filterColor(list);
        else System.out.println("Неверный ввод");
    }

    static Integer readChoice() {
        Scanner sc = new Scanner(System.in, "cp866");
        Integer choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }

    static void filterRam(LinkedList<Notebook> list) {
        Map<Integer, String> ramMap = new HashMap<>();
        ramMap = Map.of(8, "8 Gb", 16, "16 Gb", 32, "32 Gb");
        
        System.out.println("Введите значение для выбора объема ОЗУ:\n" +
        "8  - 8 Gb\n" +
        "16 - 16 Gb\n" +
        "32 - 32 Gb");
        Integer choice2 = readChoice();

        if (ramMap.containsKey(choice2) == false) System.out.println("Неверный ввод");
        else {
            System.out.println("Подходящие варианты:\n");
            for (Notebook el : list) {
                if (ramMap.get(choice2).equals(el.getRam())) {
                    el.printDetail();
                }
            }
        }
    }
    static void filterHdd(LinkedList<Notebook> list) {
        Map<Integer, String> hddMap = new HashMap<>();
        hddMap = Map.of(1, "256 Gb", 512, "512 Gb", 1, "1 Tb", 2, "2 Tb");
        
        System.out.println("Введите значение для выбора объема жесткого диска:\n" +
        "256 - 256 Gb\n" +
        "512 - 512 Gb\n" +
        "1   - 1 Tb\n" +
        "2   - 2 Tb");
        Integer choice2 = readChoice();

        if (hddMap.containsKey(choice2) == false) System.out.println("Неверный ввод");
        else {
            System.out.println("Подходящие варианты:\n");
            for (Notebook el : list) {
                if (hddMap.get(choice2).equals(el.getHdd())) {
                    el.printDetail();
                }
            }
        }
    }
    static void filterOs(LinkedList<Notebook> list) {
        Map<Integer, String> osMap = new HashMap<>();
        osMap = Map.of(1, "Windows", 2, "MacOS");
        
        System.out.println("Введите значение для выбора операционной системы:\n" +
        "1 - Windows\n" +
        "2 - MacOS");
        Integer choice2 = readChoice();

        if (osMap.containsKey(choice2) == false) System.out.println("Неверный ввод");
        else {
            System.out.println("Подходящие варианты:\n");
            for (Notebook el : list) {
                if (osMap.get(choice2).equals(el.getOs())) {
                    el.printDetail();
                }
            }
        }
    }
    static void filterColor(LinkedList<Notebook> list) {
        Map<Integer, String> colorMap = new HashMap<>();
        colorMap = Map.of(1, "Black", 2, "Silver", 3, "White");
        
        System.out.println("Введите значение для выбора цвета ноутбука:\n" +
        "1 - Black\n" +
        "2 - Silver\n" +
        "3 - White");
        Integer choice2 = readChoice();

        if (colorMap.containsKey(choice2) == false) System.out.println("Неверный ввод");
        else {
            System.out.println("Подходящие варианты:\n");
            for (Notebook el : list) {
                if (colorMap.get(choice2).equals(el.getColor())) {
                    el.printDetail();
                }
            }  
        }    
    }
}
