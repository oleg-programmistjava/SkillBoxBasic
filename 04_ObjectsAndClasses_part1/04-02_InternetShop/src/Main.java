public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();

        basket.add("Молоко", 95, 0.3);
        basket.add("Хлеб",56, 2, 0.5);
        basket.add("Ножницы", 45,0.015);
        basket.add("Ручка", 25);

        basket.print("Тестовая корзина");
    }
}
