package com.example.les9opdrachtnamenlijst;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

//Voeg een REST controller class toe met naam NameController

@RestController
public class NameController {

    //Introduceer ArrayList veld om namen in op te slaan
    private ArrayList<String> names = new ArrayList<>();

    //Voeg een endpoint toe (met @PostMapping, pad “/ add ”) om naam toe te voegen aan lijst
    @PostMapping("add")
    public void addName(String name){
        names.add(name);
    }

    //Voeg een endpoint toe (met @GetMapping, pad “/show”) om lijst met namen op te vragen: “Hallo <naam>” voor elke naam

    @GetMapping("show")
    public  ArrayList<String> retrieveNames(){
        ArrayList<String> result = new ArrayList<>();
        for (String name: names) {
            result.add(new StringBuilder(name).reverse().toString());
        }
        return result;
    }
}

//Toon aan met Postman dat het werkt

//Extra:
//Ontdubbel lijst met namen

//Kun je doen door  de ArrayList vervangen door een HashSet in de NameController-klasse.: Zie NameController2.java

//Draai namen om (‘Klaas’ => ‘saalK):
//Je kunt de namen omkeren in de NameController-klasse door de String-waarde te manipuleren voor elke naam in de lijst middels een Stringbuilder object. Elke naam in de lijst wordt eerst omgezet in een StringBuilder-object en vervolgens omgedraaid door de reverse-methode aan te roepen. Het resulterende object wordt vervolgens weer omgezet in een String-waarde en toegevoegd aan de uitvoerlijst.

