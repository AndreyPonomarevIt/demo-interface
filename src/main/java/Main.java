

public class Main {
    public static void main(String[] args) {
        PetsFood unit=new PetsFood();
        Cat cat=new Cat(8, 5);
        Dog dog=new Dog(6,35);
        unit.foodForAnimals(cat);
        unit.foodForAnimals(dog);
        unit.breedsCatOrDog(cat);
        unit.breedsCatOrDog(dog);
    }
}
