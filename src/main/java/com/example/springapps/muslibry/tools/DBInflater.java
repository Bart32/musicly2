package com.example.springapps.muslibry.tools;

import com.example.springapps.muslibry.model.Artist;
import com.example.springapps.muslibry.model.Song;
import com.example.springapps.muslibry.repositories.ArtistRepo;
import com.example.springapps.muslibry.repositories.SongRepo;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DBInflater implements ApplicationListener<ContextRefreshedEvent> {

    private ArtistRepo artistRepo;
    private SongRepo songRepo;

    public DBInflater(ArtistRepo artistRepo, SongRepo songRepo) {
        this.artistRepo = artistRepo;
        this.songRepo = songRepo;
    }

    private void initData() {
        Artist john = new Artist("John", "Frusciante", "Fru");
        Song pastRecedes = new Song("Past Recedes", "aternative", "060606", "2005", "Niandra");
        john.getSongs().add(pastRecedes);
        pastRecedes.getArtists().add(john);
        artistRepo.save(john);
        songRepo.save(pastRecedes);
    }
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
