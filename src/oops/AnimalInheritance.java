package oops;

class Animal {
    void makeSound(){
        System.out.println("Animal Sounds.");
    }
}

class Dog extends Animal{
    void makeSound() {
        System.out.println("Dog Barks: Bow..Bow..");
    }
}

class Cat extends Animal{
    void makeSound() {
        System.out.println("Cat: Meow...Meow...");
    }
}

public class AnimalInheritance {
    public static void main(String[] args) {
        Animal animal= new Animal();
        animal.makeSound();

        Animal dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();
    }
}