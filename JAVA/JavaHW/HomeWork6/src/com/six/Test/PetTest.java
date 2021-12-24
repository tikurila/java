package com.six.Test;

import com.six.homeWork.Pet;
import com.six.homeWork.Species;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class PetTest {
    private final Pet petEmpty = new Pet();

    @Test
    @Order(1)
    void testToStringNull() {
        assertEquals("null{nickname='', age=-1, trickLevel=-1, habits=[]}", petEmpty.toString(), "Test with null data");
    }


    @RepeatedTest(value = 3, name = "{displayName} order is: {currentRepetition}/{totalRepetitions}")
    @Order(2)
    @Test
    void testToStringData() {
        Pet petWithData = new Pet(Species.DOG, "PetTest", 10, 75, "eat", "sleep");
        assertEquals("DOG{nickname='PetTest', age=10, trickLevel=75, habits=[eat, sleep]}", petWithData.toString(), "Test with data");
    }

    @Order(3)
    @ParameterizedTest
    @ValueSource(strings = {"Dog"})
    void checkForSpecies(String string) {
        assumeTrue(new Pet(Species.DOG, "Pet").getSpecies().name().equalsIgnoreCase(string));
    }

    @Test
    void checkSpeciesForNull() {
        assertNull(new Pet().getSpecies());
    }
}
