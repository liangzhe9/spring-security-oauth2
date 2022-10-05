package com.devin.spring.security.oauth2.server.service;

import com.devin.spring.security.oauth2.server.entity.TbPermission;

import java.util.List;


public interface TbPermissionService {
    /**
     * 查询权限
     */
    List<TbPermission> selectByUserId(Long id);
}
