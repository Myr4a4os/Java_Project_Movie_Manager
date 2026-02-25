// src/test/java/ru/netology/manager/MovieManagerTest.java

package ru.netology.manager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {

    MovieManager manager = new MovieManager();

    @Test
    void shouldAddAndFindAll() {
        manager.addMovie("Фильм 1");
        manager.addMovie("Фильм 2");

        String[] expected = {"Фильм 1", "Фильм 2"};
        assertArrayEquals(expected, manager.findAll());
    }

    @Test
    void shouldReturnLast5WhenMoreThan5() {
        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");
        manager.addMovie("Film4");
        manager.addMovie("Film5");
        manager.addMovie("Film6"); // теперь 6 фильмов

        String[] expected = {"Film6", "Film5", "Film4", "Film3", "Film2"};
        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    void shouldReturnAllInReverseWhenLessThan5() {
        manager.addMovie("A");
        manager.addMovie("B");
        manager.addMovie("C");

        String[] expected = {"C", "B", "A"};
        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    void shouldReturnEmptyWhenNoMovies() {
        String[] expected = {};
        assertArrayEquals(expected, manager.findLast());
        assertArrayEquals(expected, manager.findAll());
    }
}