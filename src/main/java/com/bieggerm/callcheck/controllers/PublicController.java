package com.bieggerm.callcheck.controllers;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicController {

    @GetMapping("/get/*")
    public void getMapping(HttpEntity<String> httpEntity){
        System.out.println("worked");
    }

    @PostMapping("/post/*")
    public void postMapping(HttpEntity<String> httpEntity){
        String json = httpEntity.getBody();
        System.out.println("worked");
    }

    @GetMapping("/put/*")
    public void putMapping(HttpEntity<String> httpEntity){
        System.out.println("worked");
    }

    @GetMapping("/delete/*")
    public void deleteMapping(HttpEntity<String> httpEntity){
        System.out.println("worked");
    }


}
