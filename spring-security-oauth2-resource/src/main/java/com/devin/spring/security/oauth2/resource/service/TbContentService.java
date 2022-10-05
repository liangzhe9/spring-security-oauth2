package com.devin.spring.security.oauth2.resource.service;

import com.devin.spring.security.oauth2.resource.entity.TbContent;

import java.util.List;

public interface TbContentService{

    List<TbContent> selectAll();

}
