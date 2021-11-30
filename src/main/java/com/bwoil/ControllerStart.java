package com.bwoil;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSwagger2Doc
@SpringBootApplication
public class ControllerStart {
    public static void main(String[] args) {
        SpringApplication.run(ControllerStart.class,args);
    }
}
