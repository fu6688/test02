package com.felix;

import jdk.jfr.Enabled;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class FelixApplication {
    public static void main (String[] args) {
        SpringApplication.run(FelixApplication.class,args);
    }
}
