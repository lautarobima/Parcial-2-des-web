package com.example.Parcial2.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MainController {

    @GetMapping("/")
    public String StartPage() {
        return "Index";
    }
    
}