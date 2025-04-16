package com.example.server.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;

@Document
public class Booking {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private int passengers;
    private String flightClass;  // Consider using an enum instead
    private String phoneNumber;
    private LocalTime time;
    private LocalDate departureDate;

    public Booking(){}

    public Booking(String firstName, String lastName, int passengers, String flightClass, String phoneNumber, LocalTime time, LocalDate departureDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passengers = passengers;
        this.flightClass = flightClass;
        this.phoneNumber = phoneNumber;
        this.time = time;
        this.departureDate = departureDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }
}
