package com.mikheiev.spring.concert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class AudienceAspectTest {

    @Autowired
    private Performance performance;

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void audienceIsHappyWithPerformance() {
        performance.perform();
        assertTrue("Audience didn't clap.", log.getLog().contains("CLAP CLAP CLAP!"));
    }

    @Test
    public void audienceDmandsRefund() throws Exception {
        performance.perform(true);
    }
}
