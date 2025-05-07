package com.example.seccion09V.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class ApiController 
{
    @GetMapping("/saludo")
    public String hola(){
        return "Hola desde el controlador ApiController";
    }

    @GetMapping("/despedida")
    public String chao(){
        return "Adios desde el controlador ApiController";
    }
}
