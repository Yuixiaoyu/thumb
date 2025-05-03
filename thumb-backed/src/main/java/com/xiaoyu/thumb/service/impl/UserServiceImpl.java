package com.xiaoyu.thumb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoyu.thumb.constant.UserConstant;
import com.xiaoyu.thumb.model.entity.User;
import com.xiaoyu.thumb.service.UserService;
import com.xiaoyu.thumb.mapper.UserMapper;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

/**
* @author 张飞宇
* @description 针对表【user】的数据库操作Service实现
* @createDate 2025-05-02 18:45:01
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{


    @Override
    public User getLoginUser(HttpServletRequest request) {
        return (User) request.getSession().getAttribute(UserConstant.USER_LOGIN_STATE);
    }


}




