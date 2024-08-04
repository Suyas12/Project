package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Payments;

public interface PaymentRepository extends JpaRepository<Payments, Long>{

}
