package com.ztx.service;

import com.ztx.entity.UserFile;

import java.util.List;

/**
 * @Author rope
 * @Date 2020/7/27 3:26
 * @Version 1.0
 */
public interface UserFileService {
    List<UserFile> findByUserId(Integer id);

    void save(UserFile userFile);

    UserFile findById(Integer id);

    void update(UserFile userFile);

    void delete(Integer id);
}
