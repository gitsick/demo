package com.example.jenkins.module.controller;



import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.example.jenkins.module.domain.User;
import com.example.jenkins.module.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author Solang.Zhao (Solang.Zhao(a)gmail.com)
 * @version 1.0
 * @website https://www.cnblogs.com/
 * @date 2022-11-28 20:08
 * @since 1.0
 */

@RestController
@RequestMapping("/user")
public class Usercontroller {

   @Autowired
   UserService userService;

   @RequestMapping(value = "/select",method = RequestMethod.GET)
   public User selUse(){//return null;
      return userService.getById(1);
   }
}
