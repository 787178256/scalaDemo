package com.learn.springbootscala.controller;

import com.learn.springbootscala.common.ResultVO;
import com.learn.springbootscala.entity.MetaDatabase;
import com.learn.springbootscala.service.MetaDatabaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kimvra on 2019-04-15
 */
@RestController
@RequestMapping("/meta/database")
@Slf4j
public class MetaDatabaseController {

    @Autowired
    private MetaDatabaseService metaDatabaseService;

    @PostMapping("/save")
    public ResultVO<String> save(MetaDatabase metaDatabase) {
        metaDatabaseService.save(metaDatabase);
        return ResultVO.success();
    }

    @GetMapping("/query")
    public ResultVO<MetaDatabase> query() {
        return ResultVO.success(metaDatabaseService.query());
    }

}
