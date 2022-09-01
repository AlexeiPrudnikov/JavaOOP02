public class Cat extends Animal implements Activity {
    @Override
    public void voice() {
        System.out.println("Мяу");
    }

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void answer() {
        move();
        voice();
    }
}
