package com.learn.springbootscala.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by kimvra on 2019-04-15
 */
@Entity
@Table
@Data
public class MetaDatabase {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String location;

}
