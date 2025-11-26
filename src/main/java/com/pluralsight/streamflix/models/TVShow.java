package com.pluralsight.streamflix.models;

public class TVShow extends Media implements Watchable{

    private int numbersOfSeasons;
    private int numberOfEpisodes;

    public TVShow(String id, String title, String genre, int year, double rating, int numbersOfSeasons, int numberOfEpisodes) {
        super(id, title, genre, year, rating);
        this.numbersOfSeasons = numbersOfSeasons;
        this.numberOfEpisodes = numberOfEpisodes;
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
        return numberOfEpisodes*45;
    }
}
