package lab12_2;

public class Main {
    public static void main(String[] args) {
        Tester tester1 = new Tester();
        tester1.printInfo();

        Tester tester2 = new Tester("Валентин");
        tester2.printInfo("Данные о сотрудниках");

        Tester tester3 = new Tester("Пётр", "Петров", 3, "B2", 2600);
        tester3.printInfo("Возраст:", 34);

        Tester.staticMethod();
    }
}

