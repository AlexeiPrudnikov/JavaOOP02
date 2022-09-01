import java.util.ArrayList;
import java.util.List;

public class Human implements Activity {
    private String fullName;
    private List<Animal> animals = new ArrayList<>();

    public Human(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) {

        if (animals.size() == 0 || animals.indexOf(animal) == -1) {
            animals.add(animal);
        }
    }

    public void printAnimals() {
        for (Animal a : animals) {
            System.out.println(a.toString());
        }
    }

    @Override
    public void answer() {
        System.out.println("Привет!");
    }
}
