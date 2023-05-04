package com.example.counterservice.service;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@SessionScope
@Component
@Getter
public class MutableCounterService {

    private int number;

    public void countUp(){
        ++number;
    }

}
