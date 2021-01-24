package com.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.entity.User;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author yaoding
 * @since 2020-11-11
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
