abstract class Human {
    private String name;
    private double money;

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public void addMoney(double money) {
        if (money > 0) {
            this.money += money;
        }
    }

    public void subMoney(double money) {
        if (money > 0) {
            this.money -= money;
        }
    }

    public Human(String name, double money) {
        this.name = name;
        this.money = money;
    }
}
