package com.example.delivery.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "routes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String routeName;

    private LocalDate routeDate;

    private Boolean published;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;
}