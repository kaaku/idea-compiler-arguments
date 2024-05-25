package org.example.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static org.springframework.http.HttpMethod.GET;

@Service
public class ExampleService {

    private final RestTemplate restTemplate;

    ExampleService(RestTemplate defaultRestTemplate) {
        restTemplate = defaultRestTemplate;
    }

    public ResponseEntity<String> sendRequest() {
        return restTemplate.exchange("https://www.example.org", GET, null, String.class);
    }
}
