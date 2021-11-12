package com.bieggerm.callcheck.controllers;

import com.bieggerm.callcheck.services.SaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class PublicController {

    private SaveService saveService;

    @Autowired
    public PublicController(SaveService saveService){
        this.saveService = saveService;
    }

    @GetMapping("/get/*")
    public void getMapping(HttpServletRequest request, HttpEntity<String> httpEntity){
        saveService.saveRequest(request, httpEntity);
    }

    @PostMapping("/post/*")
    public void postMapping(HttpServletRequest request, HttpEntity<String> httpEntity){
        saveService.saveRequest(request, httpEntity);
    }

    @PutMapping("/put/*")
    public void putMapping(HttpServletRequest request, HttpEntity<String> httpEntity){
        saveService.saveRequest(request, httpEntity);
    }

    @DeleteMapping("/delete/*")
    public void deleteMapping(HttpServletRequest request, HttpEntity<String> httpEntity){
        saveService.saveRequest(request, httpEntity);
    }


}
