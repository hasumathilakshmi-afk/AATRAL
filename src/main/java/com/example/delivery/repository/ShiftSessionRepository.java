package com.example.delivery.repository;

import com.example.delivery.entity.ShiftSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShiftSessionRepository extends JpaRepository<ShiftSession, Long> {
}