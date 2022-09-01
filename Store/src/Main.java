import java.util.List;

public class Main {
    public static void main(String[] args) {
        Seller seller = new Seller("Ozon", 12000);
        seller.addItem(new Item("Water", 1, 1000, Category.Water));
        seller.addItem(new Item("Coca-Cola", 10, 1200, Category.Water));
        seller.addItem(new Item("Burger", 50, 15, Category.Food));
        seller.addItem(new Item("Soap", 4, 20, Category.Hygiene));
        seller.printStore();
        System.out.println("=============");
        Consumer consumer = new Consumer("Ivan", 1000);
        List<Item> sellerStore = seller.getItems();
        for (int i = 0; i < 10; i++) {
            consumer.addItem(sellerStore.get((int) (Math.random() * sellerStore.size())), (int) (Math.random() * 10));
        }
        System.out.println("Предварительный заказ");
        consumer.printBasket();
        consumer.buy(consumer.getBasket(), seller);
        System.out.println("=============");
        seller.printStore();
        System.out.println("=============");
        System.out.println("В кошельке " + consumer.getMoney());
    }
}