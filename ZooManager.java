import java.util.ArrayList;
import java.util.List;

public class ZooManager {
    private List<Animal> animals;

    public ZooManager() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println("Добавлено животное: " + animal.getInfo());
    }

    public void removeAnimal(String name) {
        Animal animal = findAnimalByName(name);
        if (animal != null) {
            animals.remove(animal);
            System.out.println("Удалено животное: " + animal.getInfo());
        } else {
            System.out.println("Животное с именем '" + name + "' не найдено!");
        }
    }
    public void displayAllAnimals() {
        if (animals.isEmpty()) {
            System.out.println("В зоопарке нет животных!");
            return;
        }

        System.out.println("\n=== ВСЕ ЖИВОТНЫЕ В ЗООПАРКЕ ===");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println((i + 1) + ". " + animals.get(i).getInfo());
        }
    }
    public void makeAllAnimalsSound() {
        System.out.println("\n=== ЗВУКИ ЖИВОТНЫХ ===");
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    public void performAllActions() {
        System.out.println("\n=== ДЕЙСТВИЯ ЖИВОТНЫХ ===");
        for (Animal animal : animals) {
            animal.performAction();
        }
    }
    public void feedAllAnimals() {
        System.out.println("\n=== КОРМЛЕНИЕ ЖИВОТНЫХ ===");
        for (Animal animal : animals) {
            animal.eat();
        }
    }
    public void interactWithAnimal(String name) {
        Animal animal = findAnimalByName(name);
        if (animal != null) {
            System.out.println("\n=== ВЗАИМОДЕЙСТВИЕ С " + name.toUpperCase() + " ===");
            animal.makeSound();
            animal.performAction();
            animal.eat();
        } else {
            System.out.println("Животное с именем '" + name + "' не найдено!");
        }
    }

    private Animal findAnimalByName(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                return animal;
            }
        }
        return null;
    }
}
