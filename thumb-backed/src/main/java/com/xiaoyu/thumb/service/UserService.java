package com.xiaoyu.thumb.service;

import com.xiaoyu.thumb.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

/**
* @author 张飞宇
* @description 针对表【user】的数据库操作Service
* @createDate 2025-05-02 18:45:01
*/
public interface UserService extends IService<User> {

    User getLoginUser(HttpServletRequest request);
}
