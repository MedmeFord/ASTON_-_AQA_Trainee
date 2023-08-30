package task3;

import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static task3.Main.fillArray;

public class Main {

    public static void fillArray(ArrayList<Integer> array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для завершения заполнения массива нажмите '/'");
        System.out.println("Введите число для заполнения массива, затем 'Enter'");

        String str;

        while(true) {
             str = scanner.nextLine();

            if (str.equals("/"))  {
                break;
            }
            try {
                array.add(Integer.parseInt(str));

            } catch (InputMismatchException err) {
                System.err.println("Ошибка, вы ввели не число");
            } catch (NumberFormatException err) {
                System.err.println("Ошибка входного значения, валидные ввод состоит из:\n - целых чисел\n - и закрываеющего символа ввода '/' ");
            } finally {
                scanner.close();
            }
        }
        System.out.print("Ваш массив заполнен значениями: ");
        for (Integer arr: array) {
            System.out.println(arr + " ");
        }

    }


    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        fillArray(array);

        System.out.print("Ответ: ");
        for (Integer arr: array) {
            if(arr % 3 == 0) {
                System.out.print(arr + " ");
            }
        }

    }




}
