package com.pluralsight.streamflix.models;

public abstract class Media {
    private String id;
    private String title;
    private String genre;
    private int year;
    private double rating;

    public Media(String id, String title, String genre, int year, double rating) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }

    public abstract String getDisplayInfo();

    @Override
    public String toString() {
        return String.format("%s (%d) - %s - Rating: %.1f", title, year, genre, rating);
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }
}
