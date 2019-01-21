package main.module;

import main.module.interfaces.Listenable;

public class MusicAlbum extends MediaItems implements Listenable {
    private int numberOfSongs;

    public MusicAlbum(String name, String author, boolean available,int numberOfSongs) {
        super(name, author, available);
        this.numberOfSongs = numberOfSongs;
    }


    @Override
    public void listen() {

    }

    public int getNumberOfSongs() {
        return numberOfSongs;
    }
}
