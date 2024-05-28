package com.example.demo.domain.entity;

import com.example.demo.domain.enums.EngineType;
import com.example.demo.domain.enums.TransmissionType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "car")
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    @Id
    @Column(name = "vin_code")
    private String vinCode;

    @OneToOne
    @JoinColumn(name = "owner_id", referencedColumnName = "id")
    private CarOwner carOwner;

    @OneToOne
    @JoinColumn(name = "model_id", referencedColumnName = "id")
    private CarModel carModel;

    @Column(name = "license_plate")
    private String licensePlate;

    @Column(name = "color")
    private String color;

    @Column(name = "body_number")
    private String bodyNumber;

    @Column(name = "engine_number")
    private String engineNumber;

    @Column(name = "engine_type")
    private EngineType engineType;

    @Column(name = "transmission")
    private TransmissionType transmission;
}
