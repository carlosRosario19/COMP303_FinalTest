package com.example.server.dto;

public record AddBookingDto(
        String firstName,
        String lastName,
        int passengers,
        String flightClass,
        String phoneNumber,
        String time,
        String departureDate) {
}
