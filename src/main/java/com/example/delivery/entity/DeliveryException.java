package com.example.delivery.entity;

import com.example.delivery.enums.DeliveryFailureReason;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "delivery_exceptions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeliveryException {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private DeliveryFailureReason reason;

    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "stop_id")
    private Stop stop;
}