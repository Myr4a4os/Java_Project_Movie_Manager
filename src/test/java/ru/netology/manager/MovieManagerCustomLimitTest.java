// src/test/java/ru/netology/manager/MovieManagerCustomLimitTest.java

package ru.netology.manager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerCustomLimitTest {

    @Test
    void shouldUseCustomLimit3() {
        MovieManager manager = new MovieManager(3);
        manager.addMovie("1");
        manager.addMovie("2");
        manager.addMovie("3");
        manager.addMovie("4");
        manager.addMovie("5");

        String[] expected = {"5", "4", "3"};
        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    void shouldUseCustomLimit7() {
        MovieManager manager = new MovieManager(7);
        for (int i = 1; i <= 6; i++) {
            manager.addMovie("Film" + i);
        }

        String[] expected = {"Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        assertArrayEquals(expected, manager.findLast());
    }
}