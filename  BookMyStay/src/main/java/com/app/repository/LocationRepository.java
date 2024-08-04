package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Locations;

public interface LocationRepository extends JpaRepository<Locations, Long>{

}
