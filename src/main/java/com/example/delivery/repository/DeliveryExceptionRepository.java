package com.example.delivery.repository;

import com.example.delivery.entity.DeliveryException;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryExceptionRepository extends JpaRepository<DeliveryException, Long> {
}