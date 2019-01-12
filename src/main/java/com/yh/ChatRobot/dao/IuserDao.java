package com.yh.ChatRobot.dao;


import com.yh.ChatRobot.model.User;

public interface IuserDao {

    User selectUser(long id);

}