package com.example.git.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yintianchou
 * @description TODO
 * @date 2019/12/26上午1:13
 */
@RestController("/test")
public class TestController {

    @GetMapping("hello")
    public String sayHello(){
        return "hello";
    }
}


