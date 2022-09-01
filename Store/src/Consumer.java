import java.util.ArrayList;
import java.util.List;

public class Consumer extends Human implements Communication {
    private List<Item> basket = new ArrayList<>();

    public List<Item> getBasket() {
        return basket;
    }

    public void addItem(Item item, int count) {
        Item temp = new Item(item, count);
        addItem(basket, temp);
    }

    public void printBasket() {
        System.out.println("В кошельке " + getMoney());
        printItemList(basket);
        System.out.printf("Tolat price: %s", costOfItems(basket));
        System.out.println();
        System.out.println();
    }

    public void buy(List<Item> items, Seller seller) {
        double price = costOfItems(seller.getItems(), items);
        System.out.println("Произведена проверка наличия товара.");
        System.out.println("Итоговый заказ:");
        printBasket();
        if (price > this.getMoney()) {
            System.out.println("Не хватает средств");
        } else {
            subMoney(price);
            seller.addMoney(price);
            seller.updateItems(items);
            basket = new ArrayList<>();
        }
    }

    public Consumer(String name, double money) {
        super(name, money);
    }
}
