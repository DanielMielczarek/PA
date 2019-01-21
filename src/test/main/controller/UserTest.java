package main.controller;

import main.module.Book;
import main.module.Film;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;
    Book book;

    @BeforeEach
    void setUp() {
        user = new User("Daniel");
        book = new Book("Harry Potter", "J.K.Rowling", true, 200);

    }

    @Test
    void rentItem() {
        user.rentItem(book);
        assertEquals(user.getRentedItems().size(), 1);
        assertEquals(book.isAvailable(), false);


    }

    @Test
    void rentIfItemIsNull() {
        Book book = null;
        user.rentItem(book);
        assertEquals(user.getRentedItems().size(), 0);

    }

    @Test
    void rentFewItem() {

        Film film = new Film("Harry Potter", "Someone", true, 2);
        user.rentItem(film);
        user.rentItem(book);
        assertEquals(user.getRentedItems().size(), 2);
        assertEquals(film.isAvailable(), false);
        assertEquals(book.isAvailable(), false);
    }

    @Test
    void returnItem() {
        Film film = new Film("Harry Potter", "Someone", true, 2);
        user.rentItem(book);
        user.rentItem(film);
        user.returnItem(book);
        assertEquals(user.getRentedItems().size(), 1);
        assertEquals(book.isAvailable(), true);

    }

    @Test
    void returnFewItem() {
        Film film = new Film("Harry Potter", "Someone", true, 2);
        user.rentItem(book);
        user.rentItem(film);
        user.returnItem(book);
        user.returnItem(film);
        assertEquals(user.getRentedItems().size(), 0);
        assertEquals(book.isAvailable(), true);
        assertEquals(film.isAvailable(), true);


    }

    @Test
    void returnItemIfIsNull() {
        Film film = new Film("Harry Potter", "Someone", true, 2);
        Film filmNull = null;
        user.rentItem(film);
        user.returnItem(filmNull);
        assertEquals(user.getRentedItems().size(), 1);


    }
}