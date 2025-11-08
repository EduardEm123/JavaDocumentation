public class Lion extends Animal{
    public Lion(String name) {
        super(name, "Лев");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " Р-р-р-р!");
    }

    @Override
    public void performAction() {
        System.out.println(getName() + " бегает по вольеру");
    }
}
