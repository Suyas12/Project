package com.app.dto;

import java.time.LocalDate;

public class BookingDto {
    private Long bookingId;
    private LocalDate bookingDate;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String hotelName;
    private String roomNumber;
    private String roomType;
	private String city;
    private String state;
    private double amount;
    private LocalDate paymentDate;
    
    
    public BookingDto() {
    }
    
    public BookingDto(Long bookingId, LocalDate bookingDate, LocalDate checkInDate, LocalDate checkOutDate,
    		String hotelName, String roomNumber, String roomType, String city, String state, double amount,
    		LocalDate paymentDate) {
    	super();
    	this.bookingId = bookingId;
    	this.bookingDate = bookingDate;
    	this.checkInDate = checkInDate;
    	this.checkOutDate = checkOutDate;
    	this.hotelName = hotelName;
    	this.roomNumber = roomNumber;
    	this.roomType = roomType;
    	this.city = city;
    	this.state = state;
    	this.amount = amount;
    	this.paymentDate = paymentDate;
    }

    // Getters and Setters
    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

	@Override
	public String toString() {
		return "BookingDto [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", checkInDate=" + checkInDate
				+ ", checkOutDate=" + checkOutDate + ", hotelName=" + hotelName + ", roomNumber=" + roomNumber
				+ ", roomType=" + roomType + ", city=" + city + ", state=" + state + ", amount=" + amount
				+ ", paymentDate=" + paymentDate + "]";
	}
    
    
}
