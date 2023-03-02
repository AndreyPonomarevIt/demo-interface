

public class Dog implements EatAble, Breeds {
    int age;
    int weight;

    Dog(int dog, int weight) {
        this.age = dog;
        this.weight=weight;
    }

    @Override
    public void eat() {
        if (age <= 1) {
            System.out.println("Корм для щенков");
        }
        if (age > 1 && age < 7) {
            System.out.println("Корм для взрослых собак");
        }
        if (age >= 7) {
            System.out.println("Корм для стареющих собак");
        }
    }

    @Override
    public void weight() {
        if (weight <= 10) {
            System.out.println("MINI порода");
        }
        if (weight > 10 && weight < 30) {
            System.out.println("MEDIUM порода");
        }
        if (weight >= 30) {
            System.out.println("MAXI порода");
        }
    }
}