package com.xiaoyu.thumb.service;

import com.xiaoyu.thumb.model.dto.DoThumbRequest;
import com.xiaoyu.thumb.model.entity.Thumb;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

/**
* @author 张飞宇
* @description 针对表【thumb】的数据库操作Service
* @createDate 2025-05-02 18:44:36
*/
public interface ThumbService extends IService<Thumb> {


    /**
     * 点赞
     * @param doThumbRequest
     * @param request
     * @return {@link Boolean }
     */
    Boolean doThumb(DoThumbRequest doThumbRequest, HttpServletRequest request);


    /**
     * 取消点赞
     * @param doThumbRequest
     * @param request
     * @return {@link Boolean }
     */
    Boolean undoThumb(DoThumbRequest doThumbRequest, HttpServletRequest request);


    /**
     * 是否已点赞
     * @param blogId
     * @param userId
     * @return
     */
    Boolean hasThumb(Long blogId, Long userId);


}
