package com.example.demo.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

@Entity
@Table(name = "employee_schedule")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "vacation_start_date")
    private LocalDateTime vacationStartDate;

    @Column(name = "vacation_end_date")
    private LocalDateTime vacationEndDate;

    @Column(name = "shift_duration")
    private Period shiftDuration;

    @Column(name = "work_day_start_time")
    private LocalTime workDayStartTime;
}
