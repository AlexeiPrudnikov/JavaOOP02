import java.util.ArrayList;
import java.util.List;

public class Seller extends Human implements Communication {
    private List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        addItem(items, item);
    }

    public void updateItems(List<Item> basket) {
        items = updateItems(items, basket);
    }

    public void printStore() {
        System.out.println("В кассе " + getMoney());
        printItemList(items);
        System.out.println();
    }

    public Seller(String name, double money) {
        super(name, money);
    }
}
