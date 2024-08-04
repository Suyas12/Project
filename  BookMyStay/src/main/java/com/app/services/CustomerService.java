package com.app.services;

import com.app.dto.BookingDto;

public interface CustomerService {
    BookingDto getBookingDetails(Long bookingId);
    BookingDto createBooking(BookingDto bookingDto);
    void cancelBooking(Long bookingId);
}

