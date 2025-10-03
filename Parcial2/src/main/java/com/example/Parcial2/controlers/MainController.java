package com.example.Parcial2.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

@Controller

public class MainController {

    @GetMapping("/")
    public String StartPage(Model model) {
        return "index";
    }
}