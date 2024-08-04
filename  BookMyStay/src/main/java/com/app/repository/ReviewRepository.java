package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Reviews;

public interface ReviewRepository extends JpaRepository<Reviews, Long>{

}
