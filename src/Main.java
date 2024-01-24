import java.util.Scanner;

public class Main {

    public static void task_1() {
        System.out.println("Задание 1");
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 7) {
            System.out.println("Привет");
        }
        System.out.println("________");
    }

    public static void task_2() {
        System.out.println("Задание 2");
        System.out.print("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
        System.out.println("________");
    }

    public static void task_3() {
        System.out.println("Задание 3");
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите " + (i + 1) + "-е число массива: ");
            int number = scanner.nextInt();
            numbers[i] = number;
        }
        int i = 0;
        String string = "Вывод элементов массива кратных 3-м: ";
        for (int num : numbers) {
            if (num % 3 == 0) {
                string = string + num + "; ";
            } else {
                i++;
            }
        }
        if (i != 5) {
            System.out.println(string);
        } else {
            System.out.println("Нет чисел кратных 3-м");
        }
        System.out.println("________");
    }

    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
    }
}