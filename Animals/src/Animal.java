abstract class Animal implements Activity {
    private String name;
    private String color;
    private int age;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    abstract void voice();

    @Override
    public String toString() {
        return name + " -> " + color + ", " + age;
    }

    @Override
    public boolean equals(Object obj) {
        Animal a = (Animal) obj;
        if (a.getAge() == this.getAge() &&
                a.getColor() == this.color &&
                a.name == this.name) {
            return true;
        }
        return false;
    }
}
