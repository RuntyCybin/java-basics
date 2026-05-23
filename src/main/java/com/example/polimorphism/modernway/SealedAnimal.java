package com.example.polimorphism.modernway;

public sealed interface SealedAnimal permits Dog, Cat {
  String sound();

  Integer age();
}