package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Hotels;

public interface HotelRepository extends JpaRepository<Hotels, Long>{

}
