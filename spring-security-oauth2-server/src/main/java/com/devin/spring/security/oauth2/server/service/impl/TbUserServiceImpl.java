package com.devin.spring.security.oauth2.server.service.impl;

import com.devin.spring.security.oauth2.server.entity.TbUser;
import com.devin.spring.security.oauth2.server.mapper.TbUserMapper;
import com.devin.spring.security.oauth2.server.service.TbUserService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

@Service
public class TbUserServiceImpl implements TbUserService {

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getByUserName(String username) {
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username", username);
        return tbUserMapper.selectOneByExample(example);
    }
}
