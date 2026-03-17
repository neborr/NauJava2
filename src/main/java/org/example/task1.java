package org.example;
import java.util.Arrays;

public class task1 {
    public static void task1() {
        int[] randomNumbers = new int[10];

        for(int i = 0; i < randomNumbers.length; ++i) {
            randomNumbers[i] = (int)((double)513.0F * Math.random()) + -256;
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
