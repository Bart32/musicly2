package com.example.springapps.muslibry.repositories;

import com.example.springapps.muslibry.model.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepo extends CrudRepository<Artist, Long> {
}
