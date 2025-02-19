package com.jhonbrena.Model;

import com.jhonbrena.Model.Enum.AnimalType;

public class Dog extends Animal {
    public Dog(String name) {
        super(name, AnimalType.TERRESTRE);
    }
    @Override
    public String makeSound() {
        return "Guau Guau";
    }
}