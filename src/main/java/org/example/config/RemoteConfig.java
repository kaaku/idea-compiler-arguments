package org.example.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RemoteConfig {

    @Bean
    RestTemplate restTemplateWithBasicAuth(RestTemplateBuilder builder) {
        return builder.basicAuthentication("foo", "bar").build();
    }

    @Bean
    RestTemplate defaultRestTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
