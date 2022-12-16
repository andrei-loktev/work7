public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //task2
        System.out.println("задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        //task3
        System.out.println("задание 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        //task4
        System.out.println("задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //task5
        System.out.println("задание 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + "год является високосным");
        }
        //task6
        System.out.println("задание 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        //task7
        System.out.println("задание 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        //task8,9
        System.out.println("задание 8,9");
        int deposit = 29_000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + deposit;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + "рублей");
        }
        //task10
        System.out.println("задание 10");
        int tab = 2;
        for (int i = 1; i <= 10; i++) {
            tab = i * 2;
            System.out.println(tab);
        }
    }
}