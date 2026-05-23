package com.example.polimorphism.modernway;

public record Cat(String sound, Integer age) implements SealedAnimal {
  public Cat {
    if (age < 0) {
      throw new IllegalArgumentException("Age cannot be negative");
    }
    if (sound == null || sound.isEmpty()) {
      throw new IllegalArgumentException("Sound cannot be null or empty");
    }
  }

  public static final Integer MAX_LIVES = 9;
}
