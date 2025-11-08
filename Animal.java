public abstract class Animal {
    private String name;
    private String species;
    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }
    public abstract void makeSound();
    public abstract void performAction();
    public void eat() {
        System.out.println(name + " (" + species + ") кушает");
    }

    public void sleep() {
        System.out.println(name + " (" + species + ") спит");
    }

    public String getInfo() {
        return "Имя: " + name + ", Вид: " + species;
    }
    public String getName() { return name; }
    public String getSpecies() { return species; }
}
