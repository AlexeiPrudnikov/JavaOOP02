public class Item {
    private String name;
    private double price;
    private int count;
    private Category category;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object obj) {
        Item item = (Item) obj;
        if (item.name == this.name && item.category == this.category) {
            return true;
        }
        return false;
    }

    public Item(String name, double price, int count, Category category) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.category = category;
    }

    public Item(Item item, int count) {
        this(item.name, item.getPrice(), count, item.category);
    }
}
