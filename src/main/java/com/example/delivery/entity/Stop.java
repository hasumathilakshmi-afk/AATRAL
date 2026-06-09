package com.example.delivery.entity;

import com.example.delivery.enums.StopStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "stops")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Stop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;

    private Integer sequenceNo;

    private String eta;

    @Enumerated(EnumType.STRING)
    private StopStatus status;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;
}