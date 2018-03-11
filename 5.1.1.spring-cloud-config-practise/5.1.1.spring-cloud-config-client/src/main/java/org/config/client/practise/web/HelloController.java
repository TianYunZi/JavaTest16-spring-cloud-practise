package org.config.client.practise.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${neo.hello}")
    private String hello;

    @GetMapping("/api/v1/hello")
    public String hello() {
        return this.hello;
    }
}
