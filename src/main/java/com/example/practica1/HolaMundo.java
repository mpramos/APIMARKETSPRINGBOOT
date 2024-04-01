package com.example.practica1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")
public class HolaMundo {
    @GetMapping("/hola")
    public String saludar(){
        return  "Hola a todos ✈✈";
    }
}
