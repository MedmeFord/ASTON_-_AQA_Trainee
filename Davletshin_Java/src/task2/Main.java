package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите имя: ");

        Scanner scanner = new Scanner(System.in);

        // наммеренное не использование тернарного оператора
        if (scanner.nextLine().equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав.");
        } else {
            System.out.println("Неверное имя");
        }
        scanner.close();
    }
}