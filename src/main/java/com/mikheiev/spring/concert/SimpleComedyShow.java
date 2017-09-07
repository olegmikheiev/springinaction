package com.mikheiev.spring.concert;

import org.springframework.stereotype.Component;

@Component
public class SimpleComedyShow implements Performance {
    @Override
    public void perform() {
        System.out.println("It's really funny!");
    }
}
