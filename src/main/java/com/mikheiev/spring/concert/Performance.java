package com.mikheiev.spring.concert;

public interface Performance {
    void perform();
    void perform(boolean doFail) throws Exception;
}
