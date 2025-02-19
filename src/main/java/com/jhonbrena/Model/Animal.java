package com.jhonbrena.Model;

import com.jhonbrena.Inteface.Soundable;
import com.jhonbrena.Model.Enum.AnimalType;

public abstract class Animal implements Soundable {
    public String name;
    public AnimalType type;

    public Animal(String name, AnimalType type) {
        this.name = name;
        this.type = type;
    }

    public AnimalType getType() {
        return type;
    }

    @Override
    public abstract String makeSound();
}