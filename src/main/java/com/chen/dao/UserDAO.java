package com.chen.dao;

import com.chen.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper //用来创建DAO对象
public interface UserDAO {

    void save(User user);

    User findByUserName(String username);
}
