package com.example.database.repository;

import com.example.database.entity.GenericEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericRepository<E extends GenericEntity> extends JpaRepository<E, Long> {
    void getUserById(long l);
}
