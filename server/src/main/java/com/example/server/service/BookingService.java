package com.example.server.service;

import com.example.server.dto.AddBookingDto;

public interface BookingService {
    void save(AddBookingDto dto);
}
