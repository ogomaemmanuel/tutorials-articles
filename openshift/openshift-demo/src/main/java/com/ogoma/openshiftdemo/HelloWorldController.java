package com.ogoma.openshiftdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HelloWorldController {
    @GetMapping
    public ResponseEntity greeting() {
        return ResponseEntity.ok("Hello World!");
    }
}
