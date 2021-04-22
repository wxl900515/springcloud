package com.wxl.app.service.impl;

import com.wxl.app.entity.User;
import com.wxl.app.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author wxl
 * @version 1.0
 * @description: TODO
 * @date 2021/4/22 18:40
 */
@Service("userService")
public class UserServiceImpl implements UserService {


    @Override
    public User findByUserId(Integer id) {
        User us = new User();
        us.setId(1);
        us.setName("张三");
        us.setAge(18);
        us.setSex(0);
        return us;
    }
}
