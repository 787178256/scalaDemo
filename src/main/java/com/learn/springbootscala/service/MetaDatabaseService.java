package com.learn.springbootscala.service;

import com.learn.springbootscala.entity.MetaDatabase;
import com.learn.springbootscala.repository.MetaDatabaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by kimvra on 2019-04-15
 */
@Service
public class MetaDatabaseService {

    @Autowired
    private MetaDatabaseRepository metaDatabaseRepository;

    @Transactional
    public void save(MetaDatabase metaDatabase) {
        metaDatabaseRepository.save(metaDatabase);
    }

    public Iterable<MetaDatabase> query() {
        return metaDatabaseRepository.findAll();
    }

}
