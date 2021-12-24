package com.homeWork8.Test;

import com.homeWork8.Dog;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assume.assumeTrue;

public class PetTest {
    private final Dog dog = new Dog("Dog",10,75,"eat");

    @Test
    void testToStringNull() {
        assertNotEquals("null{nickname='', age=-1, trickLevel=-1, habits=[]}", dog.toString(), "Test with null data");
    }


    @Test
    void testToStringData() {
        assertEquals("DOG{nickname='Dog', age=10, trickLevel=75, habits=[eat]}", dog.toString(), "Test with data");
    }



}
