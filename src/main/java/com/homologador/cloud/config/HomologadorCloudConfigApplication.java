package com.homologador.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class HomologadorCloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomologadorCloudConfigApplication.class, args);
    }
}
