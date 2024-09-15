public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;

    private double totalWeight = 0.00;

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1, 0.0);
    }

    public void add(String name, int price, double weight) { add(name, price, 1, weight); }

    public void add(String name, int price, int count, double weight) {

        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n- " + name + ": " +
                count + " шт., " + "Цена: " + price + " руб., " + "Вес: " + weight + " кг.";
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + count * weight;

    }

    public int getTotalPrice() { return totalPrice; }

    public double getTotalWeight() { return totalWeight; }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
            System.out.println("---");
            System.out.println("Итоговая сумма: " + getTotalPrice() + " руб.");
            System.out.println("Итоговый вес: " + getTotalWeight() + " кг.");
        }
    }
}
