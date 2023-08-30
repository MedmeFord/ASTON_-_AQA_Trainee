package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите целое число: ");

        Scanner scanner = new Scanner(System.in);

        // использование вложенного тернарного оператора. Добавлена проверка на целочисленный ввод
        System.out.println(scanner.hasNextInt() ? (scanner.nextInt() > 7) ? "Привет" : "Ваше число меньше или равно 7" : "Введены невалидные данные");
        scanner.close();
    }
}