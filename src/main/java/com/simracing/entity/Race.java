package com.simracing.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "races")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String circuit;
    private String country;
    private LocalDateTime raceDate;
    private Integer laps;

    @ManyToOne
    @JoinColumn(name = "season_id")
    private Season season;

    @OneToMany(mappedBy = "race", cascade = CascadeType.ALL)
    private List<RaceResult> results;
}