package com.example.jenkins.module;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author Solang.Zhao (Solang.Zhao(a)gmail.com)
 * @version 1.0
 * @website https://www.cnblogs.com/
 * @date 2022-11-29 18:24
 * @since 1.0
 */
@SpringBootApplication
public class DemoApplication {
  public static void main(String[] args) {
   SpringApplication.run(DemoApplication.class, args);
  }
}
