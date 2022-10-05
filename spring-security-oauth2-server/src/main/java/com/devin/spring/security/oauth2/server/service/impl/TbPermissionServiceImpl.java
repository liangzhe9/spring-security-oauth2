package com.devin.spring.security.oauth2.server.service.impl;

import com.devin.spring.security.oauth2.server.entity.TbPermission;
import com.devin.spring.security.oauth2.server.mapper.TbPermissionMapper;
import com.devin.spring.security.oauth2.server.service.TbPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbPermissionServiceImpl implements TbPermissionService {

    @Resource
    private TbPermissionMapper TbPermissionMapper;

    @Override
    public List<TbPermission> selectByUserId(Long id) {
        return TbPermissionMapper.selectByUserId(id);
    }
}
