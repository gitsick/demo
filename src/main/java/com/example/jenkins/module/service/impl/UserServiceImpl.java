package com.example.jenkins.module.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.jenkins.module.domain.User;
import com.example.jenkins.module.service.UserService;
import com.example.jenkins.module.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author sick
* @description 针对表【t_sys_user(系统管理-用户基础信息表)】的数据库操作Service实现
* @createDate 2022-11-29 20:22:26
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
implements UserService{

}
