import java.util.InputMismatchException;
import java.util.Scanner;

public class ZooSystem {
    private static ZooManager zoo = new ZooManager();
    private static Scanner scanner = new Scanner(System.in);

    private static void showMenu() {
        System.out.println("\n=== СИСТЕМА УПРАВЛЕНИЯ ЗООПАРКОМ ===");
        System.out.println("1. Добавить животное");
        System.out.println("2. Удалить животное");
        System.out.println("3. Показать всех животных");
        System.out.println("4. Все животные издают звуки");
        System.out.println("5. Все животные выполняют действия");
        System.out.println("6. Покормить всех животных");
        System.out.println("7. Взаимодействовать с конкретным животным");
        System.out.println("8. Выход");
    }

    private static void addAnimal() {
        System.out.println("\nВыберите тип животного:");
        System.out.println("1. Лев");
        System.out.println("2. Слон");
        System.out.println("3. Дельфин");
        System.out.print("Ваш выбор: ");

        int type = scanner.nextInt();
        scanner.nextLine(); // очистка буфера
        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();

        Animal animal;
        switch (type) {
            case 1:
                animal = new Lion(name);
                break;
            case 2:
                animal = new Elephant(name);
                break;
            case 3:
                animal = new Dolphin(name);
                break;
            default:
                System.out.println("Неверный выбор типа животного!");
                return;
        }

        zoo.addAnimal(animal);
    }

    private static void removeAnimal() {
        System.out.print("Введите имя животного для удаления: ");
        String name = scanner.nextLine();
        zoo.removeAnimal(name);
    }

    private static void interactWithAnimal() {
        System.out.print("Введите имя животного для взаимодействия: ");
        String name = scanner.nextLine();
        zoo.interactWithAnimal(name);
    }


    public static void main(String[] args) {
        // Добавим тестовых животных
        zoo.addAnimal(new Lion("Симба"));
        zoo.addAnimal(new Elephant("Дамбо"));
        zoo.addAnimal(new Dolphin("Карпик"));

        while (true) {
            showMenu();
            System.out.print("Выберите действие: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1: addAnimal(); break;
                    case 2: removeAnimal(); break;
                    case 3: zoo.displayAllAnimals(); break;
                    case 4: zoo.makeAllAnimalsSound(); break;
                    case 5: zoo.performAllActions(); break;
                    case 6: zoo.feedAllAnimals(); break;
                    case 7: interactWithAnimal(); break;
                    case 8:
                        System.out.println("До свидания!");
                        return;
                    default:
                        System.out.println("Неверный выбор!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите число!");
                scanner.nextLine();
            }
        }
    }
}
