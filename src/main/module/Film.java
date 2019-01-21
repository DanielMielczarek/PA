package main.module;

import main.module.interfaces.Listenable;
import main.module.interfaces.Watchable;

public class Film extends MediaItems implements Watchable, Listenable {

    private int length;

    public Film(String name, String author, boolean available, int length) {
        super(name, author, available);
        this.length = length;
    }

    @Override
    public void listen() {

    }

    @Override
    public void watch() {

    }

    public int getLength() {
        return length;
    }
}
