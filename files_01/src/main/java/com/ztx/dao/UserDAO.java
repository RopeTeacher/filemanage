package com.ztx.dao;

import com.ztx.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @Author rope
 * @Date 2020/7/26 20:29
 * @Version 1.0
 */

public interface UserDAO {

    User login(User user);
}
