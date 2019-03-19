package pers.xipiker.springcloudeurekaribbonclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudEurekaRibbonClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaRibbonClientApplication.class, args);
    }

}
