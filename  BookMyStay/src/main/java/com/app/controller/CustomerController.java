package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.BookingDto;
import com.app.services.CustomerService;

@RestController
@RequestMapping("/bookings")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/{bookingId}")
    public BookingDto getBooking(@PathVariable Long bookingId) {
        return customerService.getBookingDetails(bookingId);
    }

    @PostMapping
    public BookingDto createBooking(@RequestBody BookingDto bookingDto) {
        return customerService.createBooking(bookingDto);
    }

    @DeleteMapping("/{bookingId}")
    public void cancelBooking(@PathVariable Long bookingId) {
        customerService.cancelBooking(bookingId);
    }
}

