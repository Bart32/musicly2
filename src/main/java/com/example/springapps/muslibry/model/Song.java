package com.example.springapps.muslibry.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String genre;
    private String ismn;
    private String publisher;
    private String year;

    @ManyToMany
    private Set<Artist> artists = new HashSet<>();

    public Song(String title, String genre, String ismn, String publisher, String year, Set<Artist> artists) {
        this.title = title;
        this.genre = genre;
        this.ismn = ismn;
        this.publisher = publisher;
        this.year = year;
        this.artists = artists;
    }
    public Song(String title, String genre, String ismn, String publisher, String year) {
        this.title = title;
        this.genre = genre;
        this.ismn = ismn;
        this.publisher = publisher;
        this.year = year;
    }
    public Song() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getIsmn() {
        return ismn;
    }
    public void setIsmn(String ismn) {
        this.ismn = ismn;
    }

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

    public Set<Artist> getArtists() {
        return artists;
    }
    public void setArtists(Set<Artist> artists) {
        this.artists = artists;
    }

}
