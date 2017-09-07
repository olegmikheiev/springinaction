package com.mikheiev.spring.soundsystem;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.logging.Logger;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    private static Logger LOG = Logger.getLogger(CDPlayerTest.class.getSimpleName());

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Autowired
    private MediaPlayer player;
    @Autowired
    private CompactDisk cd;

    @Test
    public void cdShouldNotBeNull() {
        LOG.info("Verifying that Compact Disk is not null...");
        assertNotNull("Compact Disk is null.", cd);
        LOG.info("Verification passed.");
    }

    @Test
    public void playerCanPlay() {
        LOG.info("Verifying that Player can play tracks...");
        player.play();
        String logContent = log.getLogWithNormalizedLineSeparator();
        assertTrue("Player didn't play expected track.",
                logContent.contains("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles"));
        LOG.info("Verification passed.");
    }
}
