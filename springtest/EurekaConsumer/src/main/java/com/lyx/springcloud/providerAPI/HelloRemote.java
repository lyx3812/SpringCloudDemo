package com.lyx.springcloud.providerAPI;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name= "providerAPI-helloworld")
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    public String hello1();
}