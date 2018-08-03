package com.springboot.consumer.demo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import rpc.service.DemoService;
@Component
public class consumerService {
    @Reference(version = "1.0.0")
    DemoService demoService;
    public String sayHello(String name){
        return demoService.sayHello(name);
    }
}
