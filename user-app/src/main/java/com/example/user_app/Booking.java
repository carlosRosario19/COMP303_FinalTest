package com.example.user_app;

public class Booking {
    private String firstName;
    private String lastName;
    private int passengers;
    private String flightClass;
    private String phoneNumber;
    private String time;
    private String departureDate;

    public  Booking(){
    }

    public Booking(String firstName, String lastName, int passengers, String flightClass, String phoneNumber, String time, String departureDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passengers = passengers;
        this.flightClass = flightClass;
        this.phoneNumber = phoneNumber;
        this.time = time;
        this.departureDate = departureDate;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }
}
