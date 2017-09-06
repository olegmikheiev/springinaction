package com.mikheiev.spring.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisk cd;

    @Autowired
    public CDPlayer(CompactDisk cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
