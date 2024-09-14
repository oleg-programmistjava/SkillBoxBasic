import java.util.Scanner;

public class Arithmetic {

    private int a;
    private int b;

    public Arithmetic(int a, int b) {

        this.a = a;
        this.b = b;

    }

    public void inputNumber() {
        while (a <= 0) {

            System.out.print(" - Укажите первое число: ");
            a = new Scanner(System.in).nextInt();

            if (a <= 0) {
                System.out.println("ОШИБКА! Число не может быть равно 0 или быть меньше 0!");
                System.out.println();
            }

        }

        System.out.println();

        while (b <= 0) {

            System.out.print(" - Укажите второе число: ");
            b = new Scanner(System.in).nextInt();

            if (b <= 0) {
                System.out.println("ОШИБКА! Число не может быть равно 0 или быть меньше 0!");
            }

        }
    }

    public void printAllArithmetics() {

        printSumm();

        printComposition();

        printComparingNumbers();


    }

    public void printSumm() {

        System.out.println("СУММА переданных чисел: " + (a+b) + " | (" + a + " + " + b + ")");

    }

    public void printComposition() {

        System.out.println("ПРОИЗВЕДЕНИЕ переданных чисел: " + a*b + " | (" + a + " * " + b + ")");

        System.out.println("---");
    }

    public void printComparingNumbers() {

        System.out.println("СРАВНЕНИЕ ЧИСЕЛ ПОКАЗАЛО, ЧТО: ");

        if (a > b) {
            System.out.println("- первое число больше, чем второе");
        }
        if (a < b ) {
            System.out.println("- второе число больше, чем первое");
        }
        if (a == b) {
            System.out.println("- первое и второе число равны");
        }

    }

}
