package com.devin.spring.security.oauth2.server.mapper;

import com.devin.spring.security.oauth2.server.entity.TbUser;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.MyMapper;

@Mapper
public interface TbUserMapper extends MyMapper<TbUser> {

}
