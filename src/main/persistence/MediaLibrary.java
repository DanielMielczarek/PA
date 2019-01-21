package main.persistence;

import main.module.MediaItems;

import java.util.ArrayList;
import java.util.List;

public class MediaLibrary {

    private List<MediaItems> mediaLibrary = new ArrayList<>();

    public void addItem(MediaItems mediaItems) {
        mediaLibrary.add(mediaItems);
    }

    public void removeItem(MediaItems mediaItems) {
        mediaLibrary.remove(mediaItems);
    }

    public void editItem(MediaItems mediaItems) {

    }

    public List<MediaItems> getMediaLibrary() {
        return mediaLibrary;
    }

}
