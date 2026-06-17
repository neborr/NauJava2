package org.example;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task1 {

    public static void task1(int number) {
        if (number <= 0) {
            System.out.println("Ошибка: размер массива должен быть больше 0");
            return;
        }

        int[] randomNumbers = new int[number];

        for(int i = 0; i < randomNumbers.length; ++i) {
            randomNumbers[i] = ThreadLocalRandom.current().nextInt(-255, 256);
        }

        System.out.println("Массив: " + Arrays.toString(randomNumbers));
        int maxVal = randomNumbers[0];

        for(int num : randomNumbers) {
            if (Math.abs(num) > Math.abs(maxVal)) {
                maxVal = num;
            }
        }


        System.out.println("Максимальное по модулю число: " + maxVal);
    }
}
