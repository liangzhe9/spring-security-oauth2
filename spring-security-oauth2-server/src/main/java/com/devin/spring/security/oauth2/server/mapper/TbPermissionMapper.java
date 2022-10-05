package com.devin.spring.security.oauth2.server.mapper;

import com.devin.spring.security.oauth2.server.entity.TbPermission;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

@Mapper
public interface TbPermissionMapper extends MyMapper<TbPermission> {
    List<TbPermission> selectByUserId(@Param("userId") Long id);
}
