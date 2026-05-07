package Technique3_Polymorphism;

abstract class Employee {

    abstract double calculateBonus();
}

class Manager extends Employee {

    double calculateBonus() {
        return 5000;
    }
}

class Developer extends Employee {

    double calculateBonus() {
        return 3000;
    }
}

class Intern extends Employee {

    double calculateBonus() {
        return 1000;
    }
}

public class After {

    public static void main(String[] args) {

        Employee manager = new Manager();
        Employee developer = new Developer();
        Employee intern = new Intern();

        System.out.println(manager.calculateBonus());
        System.out.println(developer.calculateBonus());
        System.out.println(intern.calculateBonus());
    }
}