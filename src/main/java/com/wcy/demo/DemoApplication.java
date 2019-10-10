package com.wcy.demo;

import com.wcy.service.JavaConfig;
import com.wcy.service.UserFunctionService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
       // SpringApplication.run(DemoApplication.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UserFunctionService userFunctionService = context.getBean(UserFunctionService.class);
        System.out.println(userFunctionService.SayHello("java config"));
        context.close();

    }

}
