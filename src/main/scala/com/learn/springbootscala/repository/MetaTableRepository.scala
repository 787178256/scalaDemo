package com.learn.springbootscala.repository

import com.learn.springbootscala.entity.MetaTable
import org.springframework.data.repository.CrudRepository

/**
  * Created by kimvra on 2019-04-15
  */
trait MetaTableRepository extends CrudRepository[MetaTable, Integer]{

}
