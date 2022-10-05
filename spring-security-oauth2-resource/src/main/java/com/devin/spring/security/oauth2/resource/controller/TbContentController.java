package com.devin.spring.security.oauth2.resource.controller;

import com.devin.spring.security.oauth2.resource.dto.ResponseResult;
import com.devin.spring.security.oauth2.resource.entity.TbContent;
import com.devin.spring.security.oauth2.resource.service.TbContentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TbContentController {

    @Resource
    private TbContentService tbContentService;

    @GetMapping("/")
    public ResponseResult<List<TbContent>> list() {
        return new ResponseResult<List<TbContent>>(HttpStatus.OK.value(), HttpStatus.OK.toString(), tbContentService.selectAll());
    }
}
