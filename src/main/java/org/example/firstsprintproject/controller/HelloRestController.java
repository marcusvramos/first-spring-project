package org.example.firstsprintproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HelloRestController {
    @GetMapping("/")
    public String helloSpring() {
        return "Hello Spring!";
    }

    @GetMapping("/random")
    public String randomMessage() {
        String[] mens={"Alo!", "Oi","Blz?","E ai?", "Jogos do dia"};
        return mens[new Random().nextInt(mens.length)];
    }
}

