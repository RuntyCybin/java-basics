package com.example.interfaces;

public class Lion implements AnimalInterface {

  @Override
  public void animalSound() {
    System.out.println("The lion says: roar");
  }

  @Override
  public void sleep() {
    System.out.println("The lion is sleeping");
  }

}
