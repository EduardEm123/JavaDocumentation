public class Dolphin extends Animal{
    public Dolphin(String name) {
        super(name, "Дельфин");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " И-и-и-и!");
    }

    @Override
    public void performAction() {
        System.out.println(getName() + " плавает и прыгает через обруч");
    }
}
