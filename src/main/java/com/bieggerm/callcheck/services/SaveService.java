package com.bieggerm.callcheck.services;

import org.springframework.http.HttpEntity;

import javax.servlet.http.HttpServletRequest;

public interface SaveService {
    void saveRequest(HttpServletRequest request, HttpEntity<String> httpEntity);
}
