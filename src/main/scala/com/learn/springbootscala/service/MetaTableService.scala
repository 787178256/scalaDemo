package com.learn.springbootscala.service

import com.learn.springbootscala.entity.MetaTable
import com.learn.springbootscala.repository.MetaTableRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
  * Created by kimvra on 2019-04-15
  */
@Service
class MetaTableService @Autowired()(metaTableRepository: MetaTableRepository){

  @Transactional
  def save(metaTable: MetaTable) = {
    metaTableRepository.save(metaTable)
  }

  def query() = {
    metaTableRepository.findAll()
  }

}
