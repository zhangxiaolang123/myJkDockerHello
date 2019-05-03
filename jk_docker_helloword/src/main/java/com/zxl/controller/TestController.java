package com.zxl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zxl on 2019/5/3.
 */
@RestController
public class TestController {
    @GetMapping("/hello")
    public String test(){
        return "helloword";
    }
}
