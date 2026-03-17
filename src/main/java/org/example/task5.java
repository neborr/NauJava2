package org.example;
public class task5 implements task5Time {
    private int seconds;
    private volatile boolean isRunning;
    private Thread timerThread;

    public task5(int startSeconds) {this.seconds = startSeconds;}

    @Override
    public void start() {
        if (isRunning) return;

        isRunning = true;
        timerThread = new Thread(() -> {
            System.out.println("Таймер запущен с: " + seconds + " сек");

            while (isRunning && seconds >= 0) {
                System.out.println("Осталось времени: " + seconds + " сек");

                if (seconds == 0) {
                    System.out.println("Время вышло");
                    isRunning = false;
                    break;
                }

                try {
                    Thread.sleep(1000);
                    seconds--;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        });
        timerThread.start();
    }

    @Override
    public void stop() {
        isRunning = false;
        if (timerThread != null) {
            timerThread.interrupt();
        }
        System.out.println("Таймер остановлен вручную");
    }
}
