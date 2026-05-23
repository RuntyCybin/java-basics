package com.example;

import java.util.Scanner;

import com.example.abstraction.Abstraction;
import com.example.abstraction.CarAbstract;
import com.example.cache.NicoLRU;
import com.example.encapsulation.Encapsulation;
import com.example.interfaces.Lion;
import com.example.polimorphism.CatPolimorphism;
import com.example.polimorphism.DogPolimorphism;
import com.example.polimorphism.Polimorphism;
import com.example.polimorphism.modernway.SealedAnimal;
import com.example.polimorphism.modernway.Cat;
import com.example.polimorphism.modernway.Dog;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Encapsulation example.......................
        Encapsulation encapsulation = new Encapsulation();
        Scanner scanner = new Scanner(System.in);
        NicoLRU nicoCacheLRU = new NicoLRU(3);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your hash code: ");
        String hashCode = scanner.nextLine();

        encapsulation.setName(name);
        encapsulation.setHashCode(hashCode);

        // write data in to cache
        nicoCacheLRU.append(name);
        nicoCacheLRU.append(hashCode);

        System.out.println("--------------------------------");
        System.out.println("My name is: " + encapsulation.getName());
        System.out.println("My password is: " + encapsulation.getHashCode());

        // Polimorphism example........................
        Polimorphism polimorphism = new Polimorphism();
        polimorphism.showMessage();

        Polimorphism dogPolimorphism = new DogPolimorphism();
        dogPolimorphism.showMessage();

        Polimorphism catPolimorphism = new CatPolimorphism();
        catPolimorphism.showMessage();

        // Abstraction example..........................
        Abstraction carAbstract = new CarAbstract();
        carAbstract.showMessage();
        carAbstract.showInfo();

        // Interface example...........................
        Lion lion = new Lion();
        lion.animalSound();
        lion.sleep();

        // Sealed class example.........................
        SealedAnimal dog = new Dog("wow", 2, "firulais");
        SealedAnimal cat = new Cat("meow", 1);

        System.out.println("Dog does: " + dog.sound());
        System.out.println("Cat does: " + cat.sound());

        scanner.close();
    }
}