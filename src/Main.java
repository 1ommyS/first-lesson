import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 10; // <тип данных> имя переменной = <значение>. [-2^32; 2^32-1]
        long b = 10000; // [-2^64;2^64-1]
        String s = "привет мир!!! DSADcxzcxz m.,/m,./";

        System.out.println(a);
        System.out.println(b);
        System.out.println(s);

        double pi = 3.14;
        float pi2 = 3.14f;

        int d = 1 + 1;
        int d2 = 2 - 3;
        int d3 = 2 * 3;
        int d4 = 8 / 2;

        System.out.println(d);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(2 / 8);

        double drob = (double) 2 / 8;
        System.out.println(drob);
        int kvadrat = 2 * 2;
        char bukva = 'l';
        String str = "lalalalala@mail.ru";
        int bukvaVCifre = (int) bukva;
        System.out.println(bukvaVCifre);
        System.out.println((char) 109);

        Scanner sc = new Scanner(System.in);
//        Scanner

//        int chisloSKlaviaturi = sc.nextInt();
//        System.out.println(chisloSKlaviaturi);

//        String strokaSKlaviaturi = sc.nextLine();
//        System.out.println(strokaSKlaviaturi);

//        double chislo = sc.nextDouble();
//        double kvadat = Math.pow(chislo, 2);
//        double sqrt = Math.sqrt(chislo); // square root
//        System.out.println(kvadat);
//        System.out.println(sqrt);

        String pupupu = "pupupupu" + " " + "papapa";
        System.out.println(pupupu + 2);

        String s1 = "Да";
        String s2 = "Да";
        System.out.println("Строки равны? " + (s1.equals(s2)));
        System.out.print("Введи свой возраст: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Скажи, пожалуйста, ты пришел с родителем");
//        boolean isWithParent = sc.nextLine().equals("Да") ? true : false;
//        boolean isOldButYoung = age >= 18;
//        boolean isDed = age >= 100;

//        System.out.println(isOldButYoung);

        boolean isWithParent = false;

        String userAnswer = sc.nextLine();
        if (userAnswer.equals("Да")) {
            isWithParent = true;
        } else if (userAnswer.equals("Нет")) {
            isWithParent = false;
        } else {
            System.err.println("Некорректный ввод");
            System.exit(0);
        }

        if ((age >= 18 && age <= 100) || isWithParent) {
            System.out.println("го в ресторан с барной картой");
        } else if (age >= 100) {
            System.out.println("тебе уже нельзя пить");
        } else {
            System.out.println("попей компотик");
        }

        Random rd = new Random();
        int randomChislo = rd.nextInt(0, 10);

        System.out.print("Попробуй угадать число от 0 до 10: ");
        int userGuess = sc.nextInt();
        System.out.println("Пора узнать, угадал ты или нет ? " + (userGuess == randomChislo));
        System.out.println("Загаданное число было равно " + randomChislo);
    }
}