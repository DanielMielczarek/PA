package main.module;

import main.module.interfaces.Readable;

public class Book extends MediaItems implements Readable {

    private int numberOfPages;

    public Book(String name, String author, boolean available,int numberOfPages) {
        super(name, author, available);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void read() {

    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
