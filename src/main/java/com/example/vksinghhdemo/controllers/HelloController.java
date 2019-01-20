package com.example.vksinghhdemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/howdy", method = RequestMethod.GET)
    public String hello() {
        return "Howdy World";
    }

    @RequestMapping(value = "/nihao", method = RequestMethod.GET)
    public String nihao() {
        return "Nihao!!";
    }

    @RequestMapping(value = "/bye", method = RequestMethod.GET)
    public String bye() {
        return "Bye World";
    }
}
