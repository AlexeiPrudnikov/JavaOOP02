public class Dog extends Animal {

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    void voice() {
        System.out.println("Гав");
    }

    @Override
    public void answer() {
        run();
        voice();
    }
}
