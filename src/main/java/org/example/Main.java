package org.example;

public class Main {
    public static void main(String[] args) throws Exception{
        Animal dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();
    }
}