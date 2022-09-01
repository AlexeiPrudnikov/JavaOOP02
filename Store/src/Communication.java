import java.util.List;

public interface Communication {
    default double costOfItems(List<Item> items) {
        double result = 0;
        for (Item i : items) {
            result += i.getCount() * i.getPrice();
        }
        return result;
    }

    default List<Item> updateItems(List<Item> items, List<Item> busket) {
        Item busketItem;
        int indexItem;
        for (int i = 0; i < busket.size(); i++) {
            busketItem = busket.get(i);
            indexItem = items.indexOf(busketItem);
            items.get(indexItem).setCount(items.get(indexItem).getCount() - busketItem.getCount());
        }
        return items;
    }

    default List<Item> exsistItems(List<Item> items, List<Item> busket) {
        Item busketItem;
        int indexItem;
        for (int i = 0; i < busket.size(); i++) {
            busketItem = busket.get(i);
            indexItem = items.indexOf(busketItem);
            if (indexItem >= 0) {
                busketItem.setCount(Math.min(busketItem.getCount(), items.get(indexItem).getCount()));
            } else {
                busketItem.setCount(0);
            }
        }
        return busket;
    }

    default void printItemList(List<Item> items) {
        for (Item i : items) {
            System.out.printf("%s: %d", i.getName(), i.getCount());
            System.out.println();
        }
    }

    default double costOfItems(List<Item> items, List<Item> busket) {
        return costOfItems(exsistItems(items, busket));
    }

    default void addItem(List<Item> items, Item item) {
        int index = items.indexOf(item);
        if (index == -1) {
            items.add(item);
        } else {
            Item existItem = items.get(index);
            existItem.setCount(existItem.getCount() + item.getCount());
        }
    }
}
