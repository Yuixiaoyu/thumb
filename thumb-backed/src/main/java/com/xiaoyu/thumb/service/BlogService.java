package com.xiaoyu.thumb.service;

import com.xiaoyu.thumb.model.entity.Blog;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoyu.thumb.model.vo.BlogVO;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

/**
* @author 张飞宇
* @description 针对表【blog】的数据库操作Service
* @createDate 2025-05-02 18:42:11
*/
public interface BlogService extends IService<Blog> {


    /**
     * 根据id获取博客VO
     * @param blogId
     * @param httpServletRequest
     * @return
     */
    BlogVO getBlogVOById(long blogId, HttpServletRequest httpServletRequest);


    /**
     * 获取博客列表VO
     * @param blogList
     * @param request
     * @return
     */
    List<BlogVO> getBlogVOList(List<Blog> blogList, HttpServletRequest request);



}
