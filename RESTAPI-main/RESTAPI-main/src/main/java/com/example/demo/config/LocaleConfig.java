package com.example.demo.config;

import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@Configuration
public class LocaleConfig {

    @PostConstruct
    public void init() {

         TimeZone.setDefault(TimeZone.getTimeZone("Asia/Jakarta"));

    }
}

