package com.example.springapps.muslibry.repositories;

import com.example.springapps.muslibry.model.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepo extends CrudRepository<Song, Long> {
}
