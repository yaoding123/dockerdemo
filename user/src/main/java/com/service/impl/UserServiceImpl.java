package com.service.impl;

import com.entity.User;
import com.mapper.UserMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yaoding
 * @since 2020-11-11
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper mapper;

    public int addUser(User user) {
        return mapper.insert(user);
    }

    public User getUser(String id) {
        return mapper.selectById(id);
    }
}
