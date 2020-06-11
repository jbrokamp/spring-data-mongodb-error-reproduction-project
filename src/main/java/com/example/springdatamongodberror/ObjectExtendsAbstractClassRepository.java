package com.example.springdatamongodberror;

import com.example.entity.SuperClass;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectExtendsAbstractClassRepository extends MongoRepository<SuperClass, String> {
}
