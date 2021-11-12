package com.bieggerm.callcheck.controllers;

import com.bieggerm.callcheck.services.SaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PublicController {

    private SaveService saveService;

    @Autowired
    public PublicController(SaveService saveService){
        this.saveService = saveService;
    }

    @GetMapping("/get/{id}/*")
    public void getMapping(HttpServletRequest request, HttpEntity<String> httpEntity, @PathVariable(name = "id") String id){
        saveService.saveRequest(request, httpEntity, id);
    }

    @PostMapping("/post/{id}/*")
    public void postMapping(HttpServletRequest request, HttpEntity<String> httpEntity, @PathVariable(name = "id") String id){
        saveService.saveRequest(request, httpEntity,id);
    }

    @PutMapping("/put/{id}/*")
    public void putMapping(HttpServletRequest request, HttpEntity<String> httpEntity, @PathVariable(name = "id") String id){
        saveService.saveRequest(request, httpEntity, id);
    }

    @DeleteMapping("/delete/{id}/*")
    public void deleteMapping(HttpServletRequest request, HttpEntity<String> httpEntity, @PathVariable(name = "id") String id){
        saveService.saveRequest(request, httpEntity, id);
    }
}
