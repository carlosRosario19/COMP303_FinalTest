package com.example.server.controller;

import com.example.server.dto.AddBookingDto;
import com.example.server.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class serverController {

    private final BookingService bookingService;

    @Autowired
    public serverController(BookingService bookingService){
        this.bookingService = bookingService;
    }

    @PostMapping("/bookings")
    public void saveBooking(@RequestBody AddBookingDto dto){
        bookingService.save(dto);
    }
}
