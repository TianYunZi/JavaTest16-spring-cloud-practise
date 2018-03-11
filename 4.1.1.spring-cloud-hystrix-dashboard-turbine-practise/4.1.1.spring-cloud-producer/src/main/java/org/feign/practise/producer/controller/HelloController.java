package org.feign.practise.producer.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @ApiOperation(value = "查询用户名", notes = "根据传入的用户名参数返回一句话")
    @GetMapping("/api/v1/hello")
    public String hello(@RequestParam String name) {
        return "hello " + name + "，this is first messge";
    }
}
