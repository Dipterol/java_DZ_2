import java.io.FileWriter;
import java.util.Scanner;

// К калькулятору из предыдущего дз добавить логирование.
//        1 + 3 = 4
//        4 + 3 = 7
public class Task_3 {
    static void task_3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число : ");
        int num = in.nextInt();
        calcLog(Integer.toString(num));
        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите оператор ( *,/,+,-) : ");
        char operator = in.next().charAt(0);
        calcLog(Character.toString(operator));
        Scanner in3 = new Scanner(System.in);
        System.out.println("Введите второе число : ");
        int num2 = in.nextInt();
        calcLog(Integer.toString(num2));
        double result;

        switch (operator) {
            case '+':
                result = num + num2;
                calcLog("=");
                calcLog(Integer.toString((int) result));
                break;
            case '-':
                result = num - num2;
                calcLog("=");
                calcLog(Integer.toString((int) result));
                break;
            case'*':
                result = num * num2;
                calcLog("=");
                calcLog(Integer.toString((int) result));
                break;
            case '/':
                result = num / num2;
                calcLog("=");
                calcLog(Integer.toString((int) result));
                break;
            default:
                System.out.println("Не знаком пока с такой операцией");
                return;
        }
        System.out.printf("Результат вычисления : " + num + " " + operator  + " " + num2 + " = " + result);
        System.out.println("\nЛогирование добавлено в файл log3.txt");
    }

    private static void calcLog(String message) {
        try {
            FileWriter writer = new FileWriter("log3.txt", true);
            writer.write(message + "\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("Ошибка записи в лог-файл");
        }
    }
}
