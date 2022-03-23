package ru.skypro;

public class Main {

    public static void main(String[] args) {
        task2();

    }

    public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName1);
    }

    public static void task2() {
        String fullName = "Иванов Семён Семёнович";
        String[] words = fullName.split(" ");
        for (String word : words) {
            System.out.print(word);
        }

    }
}
