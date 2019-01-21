package main.module;

import main.module.interfaces.Playable;

public class Game extends MediaItems implements Playable {
    private int ageRestriction;

    public Game(String name, String author, boolean available,int ageRestriction) {
        super(name, author, available);
        this.ageRestriction = ageRestriction;
    }


    @Override
    public void play() {

    }

    public int getAgeRestriction() {
        return ageRestriction;
    }
}
