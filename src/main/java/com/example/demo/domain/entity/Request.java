package com.example.demo.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "request")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "car_vin_code", referencedColumnName = "vin_code")
    private Car car;

    @OneToOne
    @JoinColumn(name = "id_autoservice", referencedColumnName = "id")
    private Autoservice autoservice;

    @Column(name = "status")
    private String status;

    @Column(name = "description")
    private String description;

    @Column(name = "application_time")
    private LocalDateTime time;

}
