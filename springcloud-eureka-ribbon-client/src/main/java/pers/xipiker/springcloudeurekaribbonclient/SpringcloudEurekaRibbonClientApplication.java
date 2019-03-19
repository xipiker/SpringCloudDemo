package pers.xipiker.springcloudeurekaribbonclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class SpringcloudEurekaRibbonClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaRibbonClientApplication.class, args);
    }

}
