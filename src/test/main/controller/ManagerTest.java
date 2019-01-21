package main.controller;

import main.module.Book;
import main.module.Film;
import main.persistence.MediaLibrary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    MediaLibrary mediaLibrary;
    Manager manager;
    Book book;

    @BeforeEach
    void setUp() {
        mediaLibrary = new MediaLibrary();
        manager = new Manager("Daniel", mediaLibrary);
        book = new Book("Harry Potter", "J.K.Rowling", true, 200);

    }

    @Test
    void addItem() {
        manager.addItem(book);

        assertEquals(mediaLibrary.getMediaLibrary().size(), 1);
    }

    @Test
    void addFewItem() {
        Film film = new Film("Harry Potter", "Someone", true, 2);

        manager.addItem(book);
        manager.addItem(film);

        assertEquals(mediaLibrary.getMediaLibrary().size(), 2);
    }

    @Test
    void addItemIfIsNull() {
        Book book = null;

        manager.addItem(book);

        assertEquals(mediaLibrary.getMediaLibrary().size(), 0);

    }

    @Test
    void removeItem() {
        manager.addItem(book);
        manager.removeItem(book);

        assertEquals(mediaLibrary.getMediaLibrary().size(), 0);
    }

    @Test
    void removeFewItem() {
        Film film = new Film("Harry Potter", "Someone", true, 2);

        manager.addItem(film);
        manager.addItem(book);
        manager.removeItem(book);
        manager.removeItem(film);

        assertEquals(mediaLibrary.getMediaLibrary().size(), 0);
    }

    @Test
    void removeIfItemIsNull() {

        Book bookNull = null;
        Film film = new Film("Harry Potter", "Someone", true, 2);
        mediaLibrary.addItem(film);
        mediaLibrary.addItem(book);

        manager.removeItem(bookNull);

        assertEquals(mediaLibrary.getMediaLibrary().size(), 2);
    }

}