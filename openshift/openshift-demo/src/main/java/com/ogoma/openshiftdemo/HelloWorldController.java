package com.ogoma.openshiftdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HelloWorldController {

    public ResponseEntity greeting(){
        return ResponseEntity.ok("Hello World!");
    }
}
