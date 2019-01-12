package com.yh.ChatRobot.service.impl;


import com.yh.ChatRobot.dao.IuserDao;
import com.yh.ChatRobot.model.User;
import com.yh.ChatRobot.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceimpl implements IUserService {

    @Resource
    private IuserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

}