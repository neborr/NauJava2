package org.example;

public class Task5 implements Task5Time {
    private int seconds;
    private volatile boolean isRunning;
    private Thread timerThread;

    public Task5(int startSeconds) {
        this.seconds = startSeconds;
    }

    @Override
    public void start() {
        if (isRunning) return;
        isRunning = true;

        timerThread = new Thread(() -> {
            try {
                while (isRunning && seconds >= 0) {
                    System.out.println("[Таймер]: " + seconds + " сек");

                    if (seconds == 0) {
                        System.out.println("Время вышло!");
                        isRunning = false;
                        break;
                    }

                    Thread.sleep(1000);
                    seconds--;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        timerThread.setDaemon(true);
        timerThread.start();
    }

    @Override
    public void stop() {
        if (!isRunning) return;

        isRunning = false;
        if (timerThread != null) {
            timerThread.interrupt();
        }
        System.out.println("Таймер был принудительно остановлен");
    }
}