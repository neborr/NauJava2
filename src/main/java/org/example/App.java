package org.example;

public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        System.out.println("task1");
        task1.task1();

        System.out.println("\n task2");
        task2.task2();

        System.out.println("\n task3");
        task3.task3();

        System.out.println("\n task4");
        task4.task4();

        System.out.println("\n task5");
        task5Time myTimer = new task5(10);
        myTimer.start();
        Thread.sleep(3500);
        myTimer.stop();
    }
}
