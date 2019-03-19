package pers.xipiker.springcloudconsulclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudConsulClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsulClientApplication.class, args);
    }

}
