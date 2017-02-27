package com.ibeifeng.jp.dao;

import com.ibeifeng.jp.mapper.UserMapper;
import com.ibeifeng.jp.model.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by zmzy on 2017/2/23.
 */
@Repository
public class UserDao implements IUserDao {
    @Autowired
    private UserMapper userMapper;

    public void add(User user) {
        userMapper.add(user);
    }

    public User load(int id) {
        return userMapper.load(id);
    }

//    @Override
//    public void add(User user) {
//        userMapper.add(user);
//    }
//
//    @Override
//    public User load(int id) {
//        return userMapper.load(id);
//    }
}
