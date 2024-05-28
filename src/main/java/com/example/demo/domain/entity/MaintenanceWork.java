package com.example.demo.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Period;

@Entity
@Table(name = "maintenance_work")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MaintenanceWork {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "time")
    private Period time;

    @Column(name = "cost")
    private Double cost;

    @OneToOne
    @JoinColumn(name = "id_work_type", referencedColumnName = "id")
    private WorkType workType;

    @OneToOne
    @JoinColumn(name = "id_model", referencedColumnName = "id")
    private CarModel carModel;

}
