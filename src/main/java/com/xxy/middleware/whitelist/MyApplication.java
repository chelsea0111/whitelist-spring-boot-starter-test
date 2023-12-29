package com.xxy.middleware.whitelist;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.xxy.middleware.*"})
public class MyApplication {
}
