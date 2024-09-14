import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int inputA = 0;
        int inputB = 0;

        Arithmetic generalArithmetic = new Arithmetic(inputA, inputB);

        System.out.print("Укажите первое число: ");
        inputA = new Scanner(System.in).nextInt();
        generalArithmetic.a = inputA;

        System.out.print("Укажите второе число: ");
        inputB = new Scanner(System.in).nextInt();
        generalArithmetic.b = inputB;


        //TODO: дописать методы класса Arithmetic ( в процессе выполнения)

        System.out.println();
        generalArithmetic.printAllArithmetics();
    }

}