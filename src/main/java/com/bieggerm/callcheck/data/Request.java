package com.bieggerm.callcheck.data;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalTime;
import java.time.ZoneId;

@Setter
@Getter
@Entity
public class Request {

    @GeneratedValue
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String uri;
    private String requestType;
    private String payload;
    private LocalTime time;
    private String sessionId;

    public Request(String uri, String requestType, String payload, String sessionId){
        this.uri = uri;
        this.requestType = requestType;
        this.payload = payload;
        this.time = LocalTime.now();
        this.sessionId = sessionId;
    }

    public Request() {

    }
}
