package com.example.server.repository;

import com.example.server.entity.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookingDaoImpl implements BookingDao{

    private final MongoTemplate mongoTemplate;

    @Autowired
    public BookingDaoImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void save(Booking booking) {
        mongoTemplate.save(booking);
    }
}
