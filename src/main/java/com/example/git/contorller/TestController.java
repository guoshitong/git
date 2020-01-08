package com.example.git.contorller;

import com.example.git.util.RedisString;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yintianchou
 * @description TODO
 * @date 2019/12/26上午1:13
 */
@RestController
public class TestController {

    @Resource
    private RedisString redisString;

    @GetMapping("hello")
    public String sayHello(){
        redisString.set();
        return "牛逼";
    }
}


