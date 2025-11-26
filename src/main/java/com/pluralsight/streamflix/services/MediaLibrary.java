package com.pluralsight.streamflix.services;

import com.pluralsight.streamflix.models.Media;

import java.util.ArrayList;

public class MediaLibrary <T extends Media>{
    private ArrayList<T> mediaLibrary;

    public MediaLibrary() {
        this.mediaLibrary = new ArrayList<>();
    }

    public void addMedia(T media){
        mediaLibrary.add(media);
        System.out.println("Added: " + media.getTitle());
    }

    public void removeMedia(String id){
        T toRemove = findMediaById(id);
        if (toRemove != null){
            mediaLibrary.remove(toRemove);
            System.out.println("Removed: " + toRemove.getTitle());
        }else {
            System.out.println("Media with ID " + id + " not found");
        }
    }

    public T findMediaById(String id){
        for (T media : mediaLibrary) {
            if(media.getId().equals(id)){
                return media;
            }
        }
        return null;
    }

    public ArrayList<T> getMediaLibrary(){
        return new ArrayList<>(mediaLibrary);
    }

    public int size(){
        return mediaLibrary.size();
    }

    public void displayAll(){
        if (mediaLibrary.isEmpty()){
            System.out.println("No media in library");
            return;
        }
        mediaLibrary.forEach(Media::getDisplayInfo);
    }
}
