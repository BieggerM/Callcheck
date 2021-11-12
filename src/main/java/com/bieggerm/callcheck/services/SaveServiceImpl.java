package com.bieggerm.callcheck.services;

import com.bieggerm.callcheck.data.Request;
import com.bieggerm.callcheck.data.repository.RequestRepository;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class SaveServiceImpl implements SaveService {

    private RequestRepository requestRepository;

    public SaveServiceImpl(RequestRepository requestRepository){
        this.requestRepository = requestRepository;
    }

    @Override
    public void saveRequest(HttpServletRequest httpCall, HttpEntity<String> payload){
        if (payload.getBody().length()<100) {
            Request request = new Request(httpCall.getRequestURI(), httpCall.getMethod(), payload.getBody());
            requestRepository.save(request);
        }
    }
}
