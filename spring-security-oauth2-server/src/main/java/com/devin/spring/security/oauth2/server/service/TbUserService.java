package com.devin.spring.security.oauth2.server.service;

import com.devin.spring.security.oauth2.server.entity.TbUser;

public interface TbUserService {
    //防止sql注入   先拿到用户名   在拿密码
    TbUser getByUserName(String username);
}
