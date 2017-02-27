package com.ibeifeng.jp.mapper;

import com.ibeifeng.jp.model.User;

/**
 * Created by zmzy on 2017/2/23.
 */
public interface UserMapper {
    public void add(User user);
    public User load(int id);
}
