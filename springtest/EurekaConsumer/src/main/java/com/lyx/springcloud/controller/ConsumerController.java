package com.lyx.springcloud.controller;

import com.lyx.springcloud.providerAPI.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private HelloRemote helloRemote;
    
    @RequestMapping("/hello2")
    public String index(){
        return helloRemote.hello1();
    }

}