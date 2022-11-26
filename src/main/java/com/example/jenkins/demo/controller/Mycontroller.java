package com.example.jenkins.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Solang.Zhao (Solang.Zhao(a)gmail.com)
 * @version 1.0
 * @website https://www.cnblogs.com/
 * @date 2022-11-25 14:15
 * @since 1.0
 */
@RestController
@RequestMapping("/my")
public class Mycontroller {

    @Value("${spring.application.name}")
    private String appName;
     @RequestMapping("/boot")
     public String getMyBabby(){
          return appName+" Hello World! 启动了。。。。。";
     }
}
