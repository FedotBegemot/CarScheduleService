package com.example.demo.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "planned_work")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlannedWork {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "workload")
    private Integer workload;

    @Column(name = "time_start")
    private LocalDateTime timeStart;

    @OneToOne
    @JoinColumn(name = "id_maintenance_work", referencedColumnName = "id")
    private MaintenanceWork maintenanceWork;

    @OneToOne
    @JoinColumn(name = "id_request", referencedColumnName = "id")
    private Request request;

    @OneToOne
    @JoinColumn(name = "id_employee", referencedColumnName = "id")
    private Employee employee;
}
