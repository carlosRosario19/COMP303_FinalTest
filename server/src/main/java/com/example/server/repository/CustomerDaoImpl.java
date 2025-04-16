package com.example.server.repository;

import com.example.server.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements CustomerDao {

    private final MongoTemplate mongoTemplate;

    @Autowired
    public CustomerDaoImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void save(Customer customer) {
        mongoTemplate.save(customer);
    }
}
