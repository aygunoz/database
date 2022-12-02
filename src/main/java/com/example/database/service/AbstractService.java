package com.example.database.service;

import com.example.database.entity.GenericEntity;
import com.example.database.repository.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractService <E extends GenericEntity>{
    @Autowired protected GenericRepository<E> repository;
}
