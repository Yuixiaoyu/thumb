package com.xiaoyu.thumb.controller;

import com.xiaoyu.thumb.common.BaseResponse;
import com.xiaoyu.thumb.common.ResultUtils;
import com.xiaoyu.thumb.constant.UserConstant;
import com.xiaoyu.thumb.model.entity.User;
import com.xiaoyu.thumb.service.UserService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: UserController
 * Description:
 *
 * @Author: fy
 * @create: 2025-05-02 18:46
 * @version: 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/login")
    public BaseResponse<User> login(long userId, HttpServletRequest httpServletRequest){

        User user = userService.getById(userId);
        httpServletRequest.getSession().setAttribute(UserConstant.USER_LOGIN_STATE,user);
        return ResultUtils.success(user);
    }

    @GetMapping("/get/login")
    public BaseResponse<User> getLoginUser(HttpServletRequest httpServletRequest){
        User user = (User) httpServletRequest.getSession().getAttribute(UserConstant.USER_LOGIN_STATE);
        return ResultUtils.success(user);
    }

}
