package com.devin.spring.security.oauth2.resource.service.impl;

import com.devin.spring.security.oauth2.resource.entity.TbContent;
import com.devin.spring.security.oauth2.resource.mapper.TbContentMapper;
import com.devin.spring.security.oauth2.resource.service.TbContentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbContentServiceImpl implements TbContentService{

    @Resource
    private TbContentMapper tbContentMapper;

    @Override
    public List<TbContent> selectAll() {
        return tbContentMapper.selectAll();
    }
}
