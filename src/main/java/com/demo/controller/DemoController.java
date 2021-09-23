package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @packageName:com.demo.controller
 * @className:DemoController
 * @description:
 * @version:版本(1.0.0)
 * @author: gaojin
 * @createDate:创建时间(2021/9/23 10:34)
 * @copyright (C) 2020-2021龙湖集团.
 */
@RestController
public class DemoController {

    @GetMapping("hello")
    public String hello(){
        return "hello world";
    }

}
