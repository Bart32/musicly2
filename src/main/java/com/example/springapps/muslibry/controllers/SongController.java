package com.example.springapps.muslibry.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SongController {

    @RequestMapping("/songs")
    public String getSongs(Model model){
        return "songs";
    }

    //TODO: zrobicz tej kalsy kontroler
    //TODO:stworzyc metode do obsługi zadania
    //TODO: zrobic mapowanie adres url na metode
    //TODO: pobrac wszystkie piosenki z bazy i wyslac do widoku
    //TODO:stworzyc formatke widoku *template) i wypelnic danymi
}
