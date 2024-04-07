package com.example.demowebapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HelloWorldController {
    @RequestMapping(method = RequestMethod.GET, path = "/helloWorld")
    public String helloWorld() {
        return "Hello world";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/ciao")
    public String ciao(@RequestParam(required = false, defaultValue = "culo") String nome, @RequestParam String cognome) {
        return "ciao " + nome + " " + cognome + "!";
    }
}
