package com.jenkins.matlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsMatlabApplication {
    public static void main(String[] args) {
        SpringApplication.run(JenkinsMatlabApplication.class, args);
        System.out.println("*****项目启动*******");
    }
}
