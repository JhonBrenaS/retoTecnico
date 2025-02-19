package com.jhonbrena.Model;

import com.jhonbrena.Model.Enum.AnimalType;

public class Fish extends Animal {
    public Fish(String name) {
        super(name, AnimalType.ACUATICO);
    }

    @Override
    public String makeSound() {
        return "Glu Glu";
    }
}