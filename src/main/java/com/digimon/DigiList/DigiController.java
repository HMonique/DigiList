package com.digimon.DigiList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DigiController {

    @GetMapping("/")
    public String home(){
        return "Welcome to the MonstersList Application";
    }
}
