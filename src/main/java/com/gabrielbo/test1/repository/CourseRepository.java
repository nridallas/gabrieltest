package com.gabrielbo.test1.repository;

import com.gabrielbo.test1.entity.CourseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CourseRepository extends CrudRepository<CourseEntity, Integer> {

    List<CourseEntity> findByName(String name);

    CourseEntity findById(int id);
    List<CourseEntity> findByAuthor(String author);

    List<CourseEntity> findAll();
}