package main.controller;

import main.module.MediaItems;
import main.persistence.MediaLibrary;

public class Manager extends User {
    private MediaLibrary mediaLibrary;

    public Manager(String name, MediaLibrary mediaLibrary) {
        super(name);
        this.mediaLibrary = mediaLibrary;

    }

    public void addItem(MediaItems item) {
        if (item == null) {
            return;
        }
        mediaLibrary.addItem(item);

        //TODO
    }

    public void removeItem(MediaItems item) {
        if (item == null) {
            return;
        }
        mediaLibrary.removeItem(item);
        //TODO
    }

    public void editItem(MediaItems item) {
    }
}
