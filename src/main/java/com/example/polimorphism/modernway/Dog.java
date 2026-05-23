package com.example.polimorphism.modernway;

public record Dog(String sound, Integer age, String apodo) implements SealedAnimal {
  public Dog {
    if (age < 0) {
      throw new IllegalArgumentException("Age cannot be negative");
    }
    if (sound == null || sound.isEmpty()) {
      throw new IllegalArgumentException("Sound cannot be null or empty");
    }
  }
}