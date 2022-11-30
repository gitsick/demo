package com.example.jenkins.demo.modules.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Solang.Zhao (Solang.Zhao(a)gmail.com)
 * @version 1.0
 * @website https://www.cnblogs.com/
 * @date 2022-11-25 14:14
 * @since 1.0
 */
@RestController
@RequestMapping("/test")
@Data
public class Testcontroller {
    @Value("${person.name}")
    private String name;

    @RequestMapping("/name")
    public String takeMyname(){
        return name+" 你好！！！！";

    }
}
