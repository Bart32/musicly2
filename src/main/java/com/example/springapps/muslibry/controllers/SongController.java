package com.example.springapps.muslibry.controllers;

import com.example.springapps.muslibry.model.Song;
import com.example.springapps.muslibry.repositories.SongRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SongController {

    private SongRepo songRepo;

    public SongController(SongRepo songRepo) {
        this.songRepo = songRepo;
    }

    @RequestMapping("/songs")
    public String getSongs(Model model){
        model.addAttribute("songs", songRepo.findAll());
        return "songs";
    }

    //TODO:stworzyc formatke widoku *template) i wypelnic danymi
}
