package main.controller;

import main.module.MediaItems;

import java.util.ArrayList;
import java.util.List;

public class User {
    public String name;
    private List<MediaItems> rentedItems = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void search(MediaItems item) {

    }

    public void checkIsAvailable(MediaItems item) {

    }

    public void preview(MediaItems item) {

    }

    public void rentItem(MediaItems item) {
        if (item == null) {
            return;
        }
        if (item.isAvailable()) {
            rentedItems.add(item);
            item.setAvailable(false);
        }
        //TODO
    }

    public void returnItem(MediaItems item) {
        if (item == null) {
            return;
        }
        rentedItems.remove(item);
        item.setAvailable(true);
        //TODO
    }


}
