package org.example;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("task1");
        int size1 = readInt(scanner, "Введите размер для task1: ");
        Task1.task1(size1);

        System.out.println("\n task2");
        int size2 = readInt(scanner, "Введите размер для task2: ");
        Task2.task2(size2);

        System.out.println("\n task3");
        Task3.task3();

        System.out.println("\n task4");
        Task4.task4();

        System.out.println("\n task5");
        int userSeconds = readInt(scanner, "На сколько секунд запустить таймер? ");
        Task5Time myTimer = new Task5(userSeconds);

        myTimer.start();

        System.out.println("Нажмите Enter, чтобы остановить таймер досрочно:");

        scanner.nextLine();
        scanner.nextLine();

        myTimer.stop();
    }
    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Ошибка: введите целое число!");
                scanner.next();
            }
        }
    }
}
