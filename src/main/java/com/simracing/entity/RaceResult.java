package com.simracing.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "race_results")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RaceResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "race_id")
    private Race race;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;

    private Integer position;
    private Integer points;
    private String fastestLap;
    private Boolean dnf;
    private Integer gridPosition;
}