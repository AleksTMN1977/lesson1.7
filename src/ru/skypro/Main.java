package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task1();
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
        String[] arrStrings1 = fullName.split(" ");
        String[] arrStrings2 = fullName.split("");
        String fullName1 = fullName.replace('ё', 'е');
        System.out.print("Данные ФИО сотрудника — " + fullName1);
    }

}

