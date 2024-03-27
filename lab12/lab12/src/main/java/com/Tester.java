package com;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester() {
    }

    public Tester(String name) {
        this(name, "Валентинов", 14, "C1", 3000);
    }

    public Tester(String name, String surname) {
        this(name , surname, 1, "", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Опыт работы: " + experienceInYears + "года(лет)");
        System.out.println("Уровень английского: " + englishLevel);
        System.out.println("Зарплата: $" + salary);
    }

    public void printInfo(String message) {
        System.out.println(message);
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Опыт работы: " + experienceInYears + "года(лет)");
        System.out.println("Уровень английского: " + englishLevel);
    }

    public void printInfo(String message, int num) {
        System.out.println(message + num);
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Опыт работы: " + experienceInYears + "года(лет)");
        System.out.println("Уровень английского: " + englishLevel);
    }

    public static void staticMethod() {
        System.out.println("Это статический метод");
    }
}

