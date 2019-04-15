package com.learn.springbootscala.controller

import com.learn.springbootscala.common.ResultVO
import com.learn.springbootscala.entity.MetaTable
import com.learn.springbootscala.service.MetaTableService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{GetMapping, PostMapping, RequestMapping, RestController}

/**
  * Created by kimvra on 2019-04-15
  */
@RestController
@RequestMapping(Array("/meta/table"))
class MetaTableController @Autowired()(metaTableService: MetaTableService){

  @PostMapping(Array("/save"))
  def save(metaTable: MetaTable) = {
    metaTableService.save(metaTable)
    ResultVO.success()
  }

  @GetMapping(Array("/query"))
  def query() = {
    ResultVO.success(metaTableService.query())
  }
}
