package com.dubbo.nacos.example.service;

import com.dubbo.nacos.example.user.IHelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class HelloServiceImpl implements IHelloService {
    @Override
    public String say(String msg) {
        return "Hello, " + msg + " I'm Dubbo Service";
    }
}
