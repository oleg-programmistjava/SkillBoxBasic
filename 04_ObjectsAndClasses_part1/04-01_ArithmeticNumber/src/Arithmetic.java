public class Arithmetic {

    int a;
    int b;

    public Arithmetic(int a, int b) {

        this.a = a;
        this.b = b;

    }

    public void printAllArithmetics() {

        printSumm();

        printComposition();

        System.out.println("---");

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
