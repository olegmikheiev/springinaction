package com.mikheiev.spring.concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class ConcertConfig {
    @Bean
    public AudienceAspect audience() {
        return new AudienceAspect();
    }

    @Bean
    public AudienceAroundAspect audienceAround() {
        return new AudienceAroundAspect();
    }
}
