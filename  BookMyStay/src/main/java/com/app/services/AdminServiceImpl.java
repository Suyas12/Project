package com.app.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.HotelDto;
import com.app.entities.Hotels;
import com.app.entities.Locations;
import com.app.entities.Room;
import com.app.repository.AdminRepository;
import com.app.repository.HotelRepository;
import com.app.repository.LocationRepository;
import com.app.repository.RoomRepository;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private RoomRepository roomRepository;
    
    @Autowired
    private ModelMapper modelMapper;
    
    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Hotels addHotel(Hotels hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Locations addLocation(Locations location) {
        return locationRepository.save(location);
    }

    @Override
    public Room addRoom(Room room) {
        return roomRepository.save(room);
    }

//    @Override
//    public HotelDto addHotel(HotelDto hotelDto) {
//        // Add Location
//        Locations location = new Locations();
//        location.setCity(hotelDto.getCity());
//        location.setState(hotelDto.getState());
//        location.setPincode(hotelDto.getPincode());
//        Locations savedLocation = locationRepository.save(location);
//
//        // Add Room
//        Room room = new Room();
//        room.setRoomNumber(hotelDto.getRoomNumber());
//        room.setRoomType(hotelDto.getRoomType());
//        room.setPricePerDay(hotelDto.getPricePerDay());
//        Room savedRoom = roomRepository.save(room);
//
//        // Add Hotel
//        Hotels hotel = new Hotels();
//        hotel.setOwner_name(hotelDto.getOwnerName());
//        hotel.setHotel_name(hotelDto.getHotelName());
//        hotel.setLocations(savedLocation);
//        hotel.setRoom(savedRoom);
//        Hotels savedHotel = hotelRepository.save(hotel);
//
//        // Update DTO with saved entities
//        hotelDto.setHotelId(savedHotel.getHotelId());
//        return hotelDto;
//    }
    
    @Override
    public HotelDto addHotel(HotelDto hotelDto) {
        // Add Location
        Locations location = modelMapper.map(hotelDto, Locations.class);
        Locations savedLocation = locationRepository.save(location);

        // Add Room
        Room room = modelMapper.map(hotelDto, Room.class);
        Room savedRoom = roomRepository.save(room);

        // Add Hotel
        Hotels hotel = modelMapper.map(hotelDto, Hotels.class);
        hotel.setOwner_name(hotelDto.getOwnerName());
      hotel.setHotel_name(hotelDto.getHotelName());
        hotel.setLocations(savedLocation);   
        hotel.setRoom(savedRoom);
        Hotels savedHotel = hotelRepository.save(hotel);

        // Update DTO with saved entities
        hotelDto.setHotelId(savedHotel.getHotelId());
        return hotelDto;
    }
    
    @Override
    public List<HotelDto> getAllHotels() {
        return hotelRepository.findAll().stream()
                .map(hotel -> modelMapper.map(hotel, HotelDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public HotelDto getHotelById(Long id) {
        return hotelRepository.findById(id)
                .map(hotel -> modelMapper.map(hotel, HotelDto.class))
                .orElse(null);
    }

    @Override
    public void deleteHotel(Long id) {
        hotelRepository.deleteById(id);
    }
    
    
}