package com.example.projetaospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    //spring.jpa.hibernate.ddl-auto=create

    @RequestMapping("/evento")
    public String index() {
        return "index";
    }
}
