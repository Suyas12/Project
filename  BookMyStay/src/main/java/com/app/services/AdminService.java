package com.app.services;

import java.util.List;

import com.app.dto.HotelDto;
import com.app.entities.Hotels;
import com.app.entities.Locations;
import com.app.entities.Room;

public interface AdminService {
    Hotels addHotel(Hotels hotel);
    Locations addLocation(Locations location);
    Room addRoom(Room room);
    HotelDto addHotel(HotelDto hotelDto);
    List<HotelDto> getAllHotels();
    HotelDto getHotelById(Long id);
    void deleteHotel(Long id);
}
