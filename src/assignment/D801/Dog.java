package assignment.D801;

public class Dog extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("Barking...");
    }
}
class Cat extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("Meaw...");
    }
}
class Tiger extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("Raoring...");
    }
}
class  Main{
    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0] = new Dog();
        animal[1] = new Cat();
        animal[2] = new Tiger();

        System.out.println();
        System.out.println("Calling Dog");
        animal[0].eat();
        animal[0].walk();
        animal[0].makeNoise();

        System.out.println("========================");

        System.out.println();
        System.out.println("Calling Cat");
        animal[1].eat();
        animal[1].walk();
        animal[1].makeNoise();

        System.out.println("========================");

        System.out.println();
        System.out.println("Calling Tiger");
        animal[2].eat();
        animal[2].walk();
        animal[2].makeNoise();

        System.out.println("========================");

        System.out.println("=========Thankyou========");
    }
}