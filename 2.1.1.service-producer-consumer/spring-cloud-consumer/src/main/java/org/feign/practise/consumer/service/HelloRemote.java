package org.feign.practise.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("spring-cloud-producer")
public interface HelloRemote {
    @GetMapping(value = "/api/v1/hello")
    String hello(@RequestParam(value = "name") String name);
}
