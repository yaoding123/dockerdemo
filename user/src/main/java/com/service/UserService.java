package com.service;

import com.entity.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yaoding
 * @since 2020-11-11
 */
public interface UserService {
    int addUser(User user);
    User getUser(String id);
}
