package com.example.server.service;

import com.example.server.dto.AddBookingDto;
import com.example.server.entity.Booking;
import com.example.server.entity.Customer;
import com.example.server.repository.BookingDao;
import com.example.server.repository.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.function.Function;

@Service
public class BookingServiceImpl implements BookingService{

    private final BookingDao bookingDao;
    private final CustomerDao customerDao;

    @Autowired
    public BookingServiceImpl(BookingDao bookingDao, CustomerDao customerDao){
        this.bookingDao = bookingDao;
        this.customerDao = customerDao;
    }

    @Transactional
    @Override
    public void save(AddBookingDto dto) {
        Booking booking = bookingMapper.apply(dto);
        Customer customer = customerMapper.apply(dto);
        bookingDao.save(booking);
        customerDao.save(customer);
    }

    private final Function<AddBookingDto, Booking> bookingMapper = dto -> {
        // Parse time and date from strings to proper types
        LocalTime time = LocalTime.parse(dto.time());
        LocalDate departureDate = LocalDate.parse(dto.departureDate());

        return new Booking(
                dto.firstName(),
                dto.lastName(),
                dto.passengers(),
                dto.flightClass(),
                dto.phoneNumber(),
                time,
                departureDate
        );
    };

    private final Function<AddBookingDto, Customer> customerMapper = dto -> {
        return new Customer(dto.firstName(), dto.lastName());
    };
}
