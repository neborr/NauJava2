package org.example;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void task3() {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Иванов Иван", 25, "IT", 100000.0));
        employees.add(new Employee("Данил Колбасенко", 35, "HR", 80000.0));
        employees.add(new Employee("Сидорова Анна", 42, "Finance", 120000.0));
        employees.add(new Employee("Кузнецов Олег", 28, "IT", 95000.0));
        employees.add(new Employee("Смирнова Елена", 31, "Marketing", 90000.0));

        List<Employee> olderThan30 = employees.stream()
                .filter(e -> e.getAge() > 30)
                .toList();

        System.out.println("Сотрудники старше 30 лет");
        olderThan30.forEach(System.out::println);
    }
}