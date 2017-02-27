package com.ibeifeng.jp.service;

import com.ibeifeng.jp.dao.IUserDao;
import com.ibeifeng.jp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zmzy on 2017/2/23.
 */
@Service
public class UserService implements IUserService {
    @Autowired

    private IUserDao userDao;

    public void add(User user) {
        userDao.add(user);
    }

    public User load(int id) {
        return userDao.load(id);
    }

//    @Override
//    public void add(User user) {
//        userDao.add(user);
//    }
//
//    @Override
//    public User load(int id) {
//        return userDao.load(id);
//    }
}
