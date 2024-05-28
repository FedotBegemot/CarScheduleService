package com.example.demo.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "wage")
    private Double wage;

    @Column(name = "productivity")
    private Double productivity;

    @OneToOne
    @JoinColumn(name = "id_autoservice", referencedColumnName = "id")
    private Autoservice autoservice;

    @OneToOne
    @JoinColumn(name = "id_position", referencedColumnName = "id")
    private Position position;

    @OneToOne
    @JoinColumn(name = "id_schedule", referencedColumnName = "id")
    private EmployeeSchedule employeeSchedule;

}
