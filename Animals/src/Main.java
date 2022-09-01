public class Main {
    public static void main(String[] args) {

        Human me = new Human("Олег");
        me.jump();
        me.run();
        Dog d1 = new Dog("Шарик", "Белый", 3);
        Dog d2 = new Dog("Шарик", "Белый", 3);
        Dog d3 = new Dog("Полкан", "Черный", 5);
        Cat c1 = new Cat("Мурзик", "Серый", 1);
        Cat c2 = new Cat("Мурзик", "Серый", 1);
        me.addAnimal(d1);
        me.addAnimal(d2);
        me.addAnimal(d1);
        me.addAnimal(d3);
        me.addAnimal(c1);
        me.addAnimal(c2);
        me.printAnimals();
        me.answer();
        c1.answer();
        d1.answer();
    }
}