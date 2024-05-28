package com.example.demo.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "autoservice")
@NoArgsConstructor
@AllArgsConstructor
public class Autoservice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "city")
    private String city;

    @Column(name = "address")
    private String address;
}