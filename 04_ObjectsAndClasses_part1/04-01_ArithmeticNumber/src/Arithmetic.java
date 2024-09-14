public class Arithmetic {

    int a;
    int b;

    public Arithmetic(int a, int b) {

        this.a = a;
        this.b = b;

    }

    public void printAllArithmetics() {
        System.out.println("СУММА переданных значений: " + (a+b));
        System.out.println("ПРОИЗВЕДЕНИЕ переданных значений: " + a*b);

        System.out.println();

        if (a > b) {
            System.out.println("Первое число больше чем второе");
        }

        if (a < b ) {
            System.out.println("Второе число больше чем первое");
        }
    }

}
