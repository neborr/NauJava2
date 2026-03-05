package org.example;
import java.util.ArrayList;
import java.util.Random;

public class task2 {
    public static void task2() {
        ArrayList<Double> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) list.add(-100.0 + (200.0 * random.nextDouble()));

        System.out.println("До сортировки: " + list);
        ArrayList<Double> sortedList = mergeSort(list);
        System.out.println("После сортировки: " + sortedList);
    }

    public static ArrayList<Double> mergeSort(ArrayList<Double> list) {
        if (list.size() <= 1)  return list;

        int mid = list.size() / 2;
        ArrayList<Double> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<Double> right = new ArrayList<>(list.subList(mid, list.size()));

        return merge(mergeSort(left), mergeSort(right));
    }

    private static ArrayList<Double> merge(ArrayList<Double> left, ArrayList<Double> right) {
        ArrayList<Double> result = new ArrayList<>();
        int leftIndex = 0, rightIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) < right.get(rightIndex)) {
                result.add(left.get(leftIndex));
                leftIndex++;
            } else {
                result.add(right.get(rightIndex));
                rightIndex++;
            }
        }

        while (leftIndex < left.size()) {
            result.add(left.get(leftIndex));
            leftIndex++;
        }
        while (rightIndex < right.size()) {
            result.add(right.get(rightIndex));
            rightIndex++;
        }

        return result;
    }
}