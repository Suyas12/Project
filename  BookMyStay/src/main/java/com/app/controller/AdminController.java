package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.HotelDto;
import com.app.entities.Hotels;
import com.app.entities.Locations;
import com.app.entities.Room;
import com.app.services.AdminService;


@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/hotels")
    public Hotels addHotel(@RequestBody Hotels hotel) {
        return adminService.addHotel(hotel);
    }

    @PostMapping("/locations")
    public Locations addLocation(@RequestBody Locations location) {
        return adminService.addLocation(location);
    }

    @PostMapping("/rooms")
    public Room addRoom(@RequestBody Room room) {
        return adminService.addRoom(room);
    }
    
    @PostMapping
    public HotelDto addHoteldto (@RequestBody HotelDto hotelDto) {
    	return adminService.addHotel(hotelDto);
    }
}
