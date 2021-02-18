package com.retoback.restws.config;

import com.retoback.restws.util.Transform;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Beans {

    @Bean
    public RestTemplate getresttemplate() {
        return new RestTemplate();
    }

    @Bean
    public Transform getTransform() {
        return new Transform();
    }
}
