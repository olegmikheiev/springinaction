package com.mikheiev.spring.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AudienceAroundAspect {

    @Pointcut("execution(* com.mikheiev.spring.concert.Performance.perform(..))")
    public void performance() {}

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("Silencing cell phones.");
            System.out.println("Taking seats.");
            joinPoint.proceed();
            System.out.println("CLAP CLAP CLAP!");
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund.");
        }
    }

}
