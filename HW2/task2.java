//Дана строка (получение через обычный текстовый файл!!!)
// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

package HW2;

import java.io.File;
import java.io.FileReader;
import java.lang.StringBuilder;

public class task2 {
    public static void main(String[] args) {      
        StringBuilder text1 = new StringBuilder();      
        text1 = replaceSubstring(fileText(), "\"фамилия\":\"", "Студент ");
        text1 = replaceSubstring(text1, "\",\"оценка\":\"", " получил ");
        text1 = replaceSubstring(text1, "\",\"предмет\":\"", " по предмету ");
        text1 = replaceSubstring(text1, "\"", ".");
        System.out.println(text1.toString());
    }

    static StringBuilder fileText() {
        File f = new File("to_task2.txt");
        StringBuilder fileText = new StringBuilder();
        try{
            FileReader fr = new FileReader(f);
            char[] a = new char[(int) f.length()];
            fr.read(a);
            
            for (char c: a) {
                fileText.append(c);  
            }
            fr.close();
            
        }
        catch (Exception e) {
            System.out.println("something is wrong");
        }
        
        return fileText;
    }

    static StringBuilder replaceSubstring (StringBuilder text, String substring1, String substring2) {
        int i1 = text.indexOf(substring1);
        int i2 = i1 + substring1.length();
        while (i1 != -1) {
            text = text.replace(i1, i2, substring2);
            i1 = text.indexOf(substring1);
            i2 = i1 + substring1.length();
        }
        return text;
    }

}
