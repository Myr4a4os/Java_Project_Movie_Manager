// src/main/java/ru/netology/manager/MovieManager.java

package ru.netology.manager;

public class MovieManager {
    private String[] movies = new String[0]; // изначально пустой массив
    private int limit;

    // Конструктор по умолчанию: лимит = 5
    public MovieManager() {
        this.limit = 5;
    }

    // Конструктор с кастомным лимитом
    public MovieManager(int limit) {
        this.limit = limit;
    }

    // Добавление фильма
    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    // Возвращает все фильмы в порядке добавления
    public String[] findAll() {
        return movies;
    }

    // Возвращает последние N фильмов в обратном порядке (новые — первыми)
    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }

        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}
