package com.mikheiev.spring.concert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class SimpleComedyShowTest {

    @Autowired
    private Performance comedyShow;

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void comedyShowIsNotNull() {
        assertNotNull(comedyShow);
    }

    @Test
    public void comedyShowIsFunny() {
        comedyShow.perform();
        assertTrue("Show was not funny...", log.getLog().contains("funny"));
    }
}
