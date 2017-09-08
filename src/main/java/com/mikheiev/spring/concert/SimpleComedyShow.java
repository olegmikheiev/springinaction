package com.mikheiev.spring.concert;

import org.springframework.stereotype.Component;

@Component
public class SimpleComedyShow implements Performance {
    @Override
    public void perform() {
        System.out.println("It's really funny!");
    }

    @Override
    public void perform(boolean doFail) throws Exception {
        if (doFail) {
            System.out.println("Let's throw an exception...");
            throw new Exception("Comedy is not funny");
        } else {
            perform();
        }
    }
}
