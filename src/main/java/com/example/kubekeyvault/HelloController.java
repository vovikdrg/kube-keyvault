package com.example.kubekeyvault;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final String helloMessage;

    public HelloController(@Value("${application.secret}") String helloMessage) {
        this.helloMessage = helloMessage;
    }

    @GetMapping
    public String Get(){
        return this.helloMessage;
    }
}
