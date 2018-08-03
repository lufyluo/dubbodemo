package com.springboot.consumer.demo.controller;

import com.springboot.consumer.demo.service.consumerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "/getHello",method = RequestMethod.GET)
    public String getHello(@RequestParam String msg){
        consumerService cs = new consumerService();
        return cs.sayHello(msg);
    }
}
