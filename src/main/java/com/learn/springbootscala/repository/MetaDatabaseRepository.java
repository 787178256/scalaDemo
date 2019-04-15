package com.learn.springbootscala.repository;

import com.learn.springbootscala.entity.MetaDatabase;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by kimvra on 2019-04-15
 */

public interface MetaDatabaseRepository extends CrudRepository<MetaDatabase, Integer> {

}
