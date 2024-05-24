package com.example.demo.domain.entity;

import com.example.demo.domain.enums.EngineType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "car")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Car {

    @Id
    @Column(name = "vin_code")
    private String vinCode;

//    @OneToOne
//    @JoinColumn(name = "owner_id", referencedColumnName = "id")
//    private Owner owner;

//    @OneToOne
//    @JoinColumn(name = "model_year_id", referencedColumnName = "id")
//    private BrandModelYear brandModelYear;

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
}
