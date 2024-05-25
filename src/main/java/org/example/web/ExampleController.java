package org.example.web;

import org.example.service.ExampleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class ExampleController {

    private final ExampleService service;

    ExampleController(ExampleService service) {
        this.service = service;
    }

    @GetMapping(value = "/api/example")
    ResponseEntity<String> get() {
        return service.sendRequest();
    }
}
