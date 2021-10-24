package Lesson_6;
/**
 * Java 1. HomeWork 6.
 *
 * @author Pavel
 * @version 24.10.2021
 */

abstract class Animal {

    protected String name;
    protected int limitRun;
    protected int limitSail;

    Animal(String name) {
        this.name = name;
    }

    public String toString() {
        return "name " + name;
    }

    abstract void run(int distance);

    abstract void sail(int distance);
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    private final int limitRun = 200;

    @Override
    void run(int distance) {
        if (distance >= limitRun)
            System.out.println("ran the distance: " + distance);
        else
            System.out.println("ERROR: distance exceeded");
    }

    @Override
    void sail(int distance) {
        System.out.println("the cat does not swim");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    private final int limitRun = 500;
    private final int limitSail = 10;

    @Override
    void run(int distance) {
        if (distance >= limitRun)
            System.out.println("ran the distance: " + distance);
        else
            System.out.println("ERROR: distance exceeded");
    }

    @Override
    void sail(int distance) {
        if (distance >= limitSail)
            System.out.println("sail the distance: " + distance);
        else
            System.out.println("ERROR: distance exceeded");
    }
}

public class HomeWork6 {

    public static void main(String... args) {

        Dog dogReks = new Dog("Reks");
        dogReks.run(300);
        dogReks.sail(7);
        System.out.println(dogReks);
        Cat catBarsik = new Cat("Barsik");
        catBarsik.run(150);
        catBarsik.sail(10);
        System.out.println(catBarsik);
    }
}
