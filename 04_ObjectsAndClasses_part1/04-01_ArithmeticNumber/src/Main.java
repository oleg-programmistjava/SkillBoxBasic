import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int inputA = 0;
        int inputB = 0;

        System.out.println("ПРОГРАММА ДЛЯ РАСЧЕТА СУММЫ, ПРОИЗВЕДЕНИЯ ЧИСЕЛ, а также");
        System.out.println("КАКОЕ ИЗ ПЕРЕДАВАЕМЫХ ЧИСЕЛ - БОЛЬШЕ ИЛИ МЕНЬШЕ, либо ОНИ РАВНЫ");
        System.out.println("---");
        System.out.print("Для продолжения нажмите ENTER ");
        keyboard.nextLine();

        System.out.println();

        Arithmetic generalArithmetic = new Arithmetic(inputA, inputB);

        System.out.println("ВВОД ИСХОДНЫХ ДАННЫХ:");

        System.out.print(" - Укажите первое число: ");
        inputA = new Scanner(System.in).nextInt();
        generalArithmetic.a = inputA;

        System.out.print(" - Укажите второе число: ");
        inputB = new Scanner(System.in).nextInt();
        generalArithmetic.b = inputB;


        //TODO: дописать методы класса Arithmetic ( в процессе выполнения)

        System.out.println();
        generalArithmetic.printAllArithmetics();


        System.out.println();

        System.out.println("===========================");
        System.out.println("    ПРОГРАММА ЗАВЕРШЕНА    ");
        System.out.println("===========================");
    }

}