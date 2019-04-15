package com.learn.springbootscala.controller

import org.springframework.web.bind.annotation.{GetMapping, RestController}

/**
  * Created by kimvra on 2019-04-15
  */
@RestController
class ScalaHello {

  @GetMapping(Array("/sayScalaHello"))
  def sayScalaHello() = {
    "Hello kimvra, this is scala hello controller..."
  }
}
