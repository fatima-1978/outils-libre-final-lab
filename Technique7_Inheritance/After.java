package Technique7_Inheritance;

abstract class Animal {

    public void eat() {

        System.out.println(
                getClass().getSimpleName()
                        + " is eating"
        );
    }

    public void sleep() {

        System.out.println(
                getClass().getSimpleName()
                        + " is sleeping"
        );
    }
}

class Dog extends Animal {
}

class Cat extends Animal {
}

public class After {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        dog.sleep();

        cat.eat();
        cat.sleep();
    }
}