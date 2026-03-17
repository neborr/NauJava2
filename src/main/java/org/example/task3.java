package org.example;
import java.util.ArrayList;
import java.util.List;

public class task3 {
    public static void task3() {
        ArrayList<employee> employees = new ArrayList<>();
        employees.add(new employee("Иванов Иван", 25, "IT", 100000.0));
        employees.add(new employee("Данил Колбасенко", 35, "HR", 80000.0));
        employees.add(new employee("Сидорова Анна", 42, "Finance", 120000.0));
        employees.add(new employee("Кузнецов Олег", 28, "IT", 95000.0));
        employees.add(new employee("Смирнова Елена", 31, "Marketing", 90000.0));

        List<employee> olderThan30 = employees.stream()
                .filter(e -> e.getAge() > 30)
                .toList();

        System.out.println("Сотрудники старше 30 лет:");
        olderThan30.forEach(System.out::println);
    }

    public static class employee {
        private String fullName;
        private Integer age;
        private String department;
        private Double salary;

        public employee(String fullName, Integer age, String department, Double salary) {
            this.fullName = fullName;
            this.age = age;
            this.department = department;
            this.salary = salary;
        }
        public String getFullName() { return fullName; }
        public void setFullName(String fullName) { this.fullName = fullName; }

        public Integer getAge() {return age;}
        public void setAge(Integer age) {this.age = age;}

        public String getDepartment() {return department;}
        public void setDepartment(String department) {this.department = department;}

        public Double getSalary() {return salary;}
        public void setSalary(Double salary) {this.salary = salary;}

        @Override
        public String toString() {
            return "Полное имя: '" + fullName + '\'' + ", возраст: " + age;
        }
    }
}
