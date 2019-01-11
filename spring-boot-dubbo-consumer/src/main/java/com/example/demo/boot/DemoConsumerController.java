package com.example.demo.boot;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO..
 *
 * @author xiaoh
 * @since 2019/1/11 10:33
 */
@RestController
public class DemoConsumerController {
    @Reference
    IHelloService helloService;

    @RequestMapping(value = "/sayHello/{name}")
    public String sayHello(@PathVariable String name) {
        return helloService.sayHello(name);
    }
}
