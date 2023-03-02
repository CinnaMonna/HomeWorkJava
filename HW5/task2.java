// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

package HW5;

import java.util.HashMap;
import java.util.Map;

public class task2 {
    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<>();
        Map<String, Integer> numDup = new HashMap<>();
        hm.put("Иванов", "Иван");
        hm.put("Петрова", "Светлана");
        hm.put("Белова", "Кристина");
        hm.put("Мусина", "Анна");
        hm.put("Крутова", "Анна");
        hm.put("Юрин", "Иван");
        hm.put("Лыков", "Петр");
        hm.put("Чернов", "Павел");
        hm.put("Чернышов", "Петр");
        hm.put("Федорова", "Мария");
        hm.put("Светлова", "Марина");
        hm.put("Савина", "Мария");
        hm.put("Рыкова", "Мария");
        hm.put("Лугова", "Марина");
        hm.put("Владимирова", "Анна");
        hm.put("Мечников", "Иван");
        hm.put("Петин", "Петр");
        hm.put("Ежов", "Иван");

        numDup = numberDuplicates(hm);
        
        for (int i = 1; i <= hm.size(); i++) {
            for (var item : numDup.entrySet()) {
                if (i == item.getValue()) {
                    System.out.printf("%s : %d\n", item.getKey(), item.getValue());
                }
            }
        }
    }

    static Map<String, Integer> numberDuplicates (Map<String, String> hm) {
        Map<String, Integer> numDup = new HashMap<>();
        Integer count = 0;
        for  (String checkName : hm.values()) {
            for (String name : hm.values()) {
                if (name.equals(checkName)) {
                    count += 1;
                }
            }
            numDup.putIfAbsent(checkName, count);
            count = 0;
        }
        return numDup;
    }
}
