package com.jhonbrena.animals;

import com.jhonbrena.Model.Animal;
import com.jhonbrena.Model.Dog;
import com.jhonbrena.Model.Eagle;
import com.jhonbrena.Model.Enum.AnimalType;
import com.jhonbrena.Model.Fish;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        for (String arg : args) {
            String[] parts = arg.split("\\|");
            if (parts.length == 3) {
                String name = parts[0];
                String type = parts[1].toUpperCase();

                switch (AnimalType.valueOf(type)) {
                    case TERRESTRE -> animals.add(new Dog(name));
                    case VOLADOR -> animals.add(new Eagle(name));
                    case ACUATICO -> animals.add(new Fish(name));
                }
            }
        }

        Map<AnimalType, List<Animal>> groupedAnimals = animals.stream()
                .collect(Collectors.groupingBy(Animal::getType));

        groupedAnimals.forEach((type, list) -> {
            System.out.println("Animales " + type + ":");
            list.forEach(animal -> System.out.println("  - " + animal.name + " hace " + animal.makeSound()));
        });
    }
}
