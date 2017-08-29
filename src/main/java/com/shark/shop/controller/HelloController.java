package com.shark.shop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pczhangyu on 2017/8/29.
 */
@RestController
public class HelloController {

    @RequestMapping("/test/info")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
