package com.jhonbrena;

import com.jhonbrena.Model.Dog;
import com.jhonbrena.Model.Eagle;
import com.jhonbrena.Model.Fish;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testDogCreation() {
        Dog dog = new Dog("Firulais");
        assertEquals("Firulais", dog.name);
        assertEquals("Guau Guau", dog.makeSound());
    }
    @Test
    void testEagleCreation() {
        Eagle eagle = new Eagle("Águila");
        assertEquals("Águila", eagle.name);
        assertEquals("Kreeeh Kreeeh", eagle.makeSound());
    }

    @Test
    void testFishCreation() {
        Fish fish = new Fish("Nemo");
        assertEquals("Nemo", fish.name);
        assertEquals("Glu Glu", fish.makeSound());
    }
}
