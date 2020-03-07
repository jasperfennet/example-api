package nl.jasperfennet.apps.exampleapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TomcatController {


    @GetMapping("/")
    public String exampelMessage(){
        return "Example message after succesfull jenkins build";
    }
}
