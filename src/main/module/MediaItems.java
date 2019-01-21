package main.module;

public abstract class MediaItems {
    private String name;
    private String author;
    private boolean available;

    public MediaItems(String name, String author, boolean available) {
        this.name = name;
        this.author = author;
        this.available = available;
    }


    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }
}
