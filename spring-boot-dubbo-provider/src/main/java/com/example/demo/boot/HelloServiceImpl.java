package com.example.demo.boot;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * TODO..
 *
 * @author xiaoh
 * @since 10:08
 */
@Service
public class HelloServiceImpl implements IHelloService{

    @Override
    public String sayHello(String str) {
        return "Hello, " + str + " (from Dubbo with Spring Boot)";
    }
}
