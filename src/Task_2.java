//Дана строка (получение через обычный текстовый файл!!!)
//        "фамилия":"Иванов","оценка":"5","предмет":"Математика"
//        "фамилия":"Петрова","оценка":"4","предмет":"Информатика"
//        Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
//        Студент [фамилия] получил [оценка] по предмету [предмет].
//        Пример вывода в консоль:
//        Студент Иванов получил 5 по предмету Математика.
//        Студент Петрова получил 4 по предмету Информатика.
//        Студент Краснов получил 5 по предмету Физика.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task_2 {
    public static void task_2() throws Exception {
        String data = fileReader();
        System.out.println("Чтение прошло успешно, строка -> " + data);
        System.out.println();
        String res = result(data);

        System.out.println("Вывод -> \n" + res);

    }

    private static String fileReader() throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader("record3.json"));
        String str = br.readLine();
        return str;
    }

    private static String result(String string) {
        String newData = string.replace("\"фамилия\"", "Студент")
                .replace(":", " ")
                .replace("\"", "")
                .replace(",", " ")
                .replace("оценка", "получил")
                .replace("предмет", "по предмету")
                .replace("[", "")
                .replace("]", "")
                .replace("{", "")
                .replace("}", "")
                .replace("Математика", "Математика\n")
                .replace("Информатика", "Информатика\n")
                .replace("Студент", "Студент");
        return newData;
    }
}
