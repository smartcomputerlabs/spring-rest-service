package com.example.springrestservice;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestWsServiceUsingSpring {
    @RequestMapping(path="test", produces= MediaType.TEXT_PLAIN_VALUE)
    public String test(){
        System.out.println("Restful");
        return "My First Restful Service Is Working";
    }
}
