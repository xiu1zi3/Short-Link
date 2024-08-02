package com.xiuzi.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiuzi.shortlink.admin.dao.entity.UserDO;

/**
 * 用户接口层
 */
public interface UserService extends IService<UserDO> {
    /**
     *
     * @param username 用户名
     * @return 用户名返回实体
     * 根据用户名查询用户信息
     */
//    UserRespDTO getUserByUsername(String username) {
//        return null;
//    }
}
