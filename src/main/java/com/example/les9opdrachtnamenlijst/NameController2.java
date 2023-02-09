package com.example.les9opdrachtnamenlijst;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

//Voeg een REST controller class toe met naam NameController

@RestController
public class NameController2 {

    //Introduceer ArrayList veld om namen in op te slaan
    private Set<String> names = new HashSet<>();

    //Voeg een endpoint toe (met @PostMapping, pad “/ add ”) om naam toe te voegen aan lijst
    @PostMapping("add")
    public void addName(String name){
        names.add(name);
    }

    //Voeg een endpoint toe (met @GetMapping, pad “/show”) om lijst met namen op te vragen: “Hallo <naam>” voor elke naam

    @GetMapping("show")
    public  Set<String> retrieveNames(){
        Set<String> result = new HashSet<>();
        for (String name: names) {
            result.add("Hallo " + name );
        }
        return result;
    }
}

//Toon aan met Postman dat het werkt

