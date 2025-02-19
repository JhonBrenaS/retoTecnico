package com.jhonbrena.Model;

import com.jhonbrena.Model.Enum.AnimalType;

public class Eagle extends Animal {
    public Eagle(String name) {
        super(name, AnimalType.VOLADOR);
    }

    @Override
    public String makeSound() {
        return "Kreeeh Kreeeh";
    }
}