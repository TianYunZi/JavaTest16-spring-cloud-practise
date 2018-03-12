package org.zuul.practise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.swagger.basic.system.SystemPropertySetter;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableDiscoveryClient
@EnableZuulProxy
public class GatewayServiceZuulApplication {
    public static void main(String[] args) {
        SystemPropertySetter.setNetworkInterfaceSelectionProperties();
        SpringApplication.run(GatewayServiceZuulApplication.class, args);
    }
}
