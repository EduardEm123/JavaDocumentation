public class Elephant extends Animal{
    public Elephant(String name) {
        super(name, "Слон");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " Ту-ту-у-у!");
    }

    @Override
    public void performAction() {
        System.out.println(getName() + " поднимает хоботом предметы");
    }
}
