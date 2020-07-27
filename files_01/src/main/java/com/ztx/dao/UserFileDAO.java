package com.ztx.dao;

import com.ztx.entity.UserFile;

import java.util.List;

/**
 * @Author rope
 * @Date 2020/7/27 3:19
 * @Version 1.0
 */
public interface UserFileDAO {
    //根据用户id获取用户文件列表
    List<UserFile> findByUserId(Integer id);

    //保存用户的文件记录
    void save(UserFile userFile);

    //根据文件id获得文件信息
    UserFile findById(Integer id);

    //更加id更新下载次数
    void update(UserFile userFile);

    //根据id删除记录
    void delete(Integer id);
}
