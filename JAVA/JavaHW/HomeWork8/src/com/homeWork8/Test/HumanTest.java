package com.homeWork8.Test;

import com.homeWork8.Human;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

public class HumanTest {
    @Test
    void testToString() {
        Human human = new Human("Sergei", "Popov", 1960);
        assertEquals("Human{name='TestName', surname='TestSurname', year=1970}", human.toString());
    }

    @Test
    @DisplayName("Test for null")
    void testNull() {
        Human human = new Human();
        assertNull(human.getFamily());
    }
}