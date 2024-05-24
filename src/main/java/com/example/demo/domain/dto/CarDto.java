package com.example.demo.domain.dto;

import com.example.demo.domain.enums.EngineType;
import lombok.Data;

@Data
public class CarDto {

    private String vinCode;
//    private Owner owner;
//    private BrandModelYear brandModelYear;
    private String licensePlate;
    private String color;
    private String bodyNumber;
    private String engineNumber;
    private EngineType engineType;
}
