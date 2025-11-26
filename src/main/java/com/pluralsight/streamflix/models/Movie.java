package com.pluralsight.streamflix.models;

public class Movie extends Media implements Watchable{

    private String director;
    private int durationMinutes;

    public Movie(String id, String title, String genre, int year, double rating,String director, int durationMinutes) {
        super(id, title, genre, year, rating);
        this.director = director;
        this.durationMinutes = durationMinutes;
    }


    @Override
    public String getDisplayInfo() {
        return "";
    }


    @Override
    public void watch() {

    }

    @Override
    public int getWatchTime() {
        return durationMinutes;
    }
}
