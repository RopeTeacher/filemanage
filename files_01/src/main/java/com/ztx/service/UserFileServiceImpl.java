package com.ztx.service;

import com.ztx.dao.UserFileDAO;
import com.ztx.entity.User;
import com.ztx.entity.UserFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @Author rope
 * @Date 2020/7/27 3:28
 * @Version 1.0
 */
@Service
@Transactional
public class UserFileServiceImpl implements UserFileService{

    @Autowired
    private UserFileDAO userFileDAO;


    @Override
    public List<UserFile> findByUserId(Integer id) {
        return userFileDAO.findByUserId(id);
    }

    @Override
    public void save(UserFile userFile) {
        //userFile.setIsImg() ？ 当当前类型含有image时 则一定是图片
        String isImg = userFile.getType().startsWith("image")?"是":"否";
        userFile.setIsImg(isImg);
        userFile.setDowncounts(0);
        userFile.setUploadTime(new Date());
        userFileDAO.save(userFile);
    }

    @Override
    public UserFile findById(Integer id) {
        return userFileDAO.findById(id);
    }

    @Override
    public void update(UserFile userFile) {
        userFileDAO.update(userFile);
    }

    @Override
    public void delete(Integer id) {
        userFileDAO.delete(id);
    }
}
