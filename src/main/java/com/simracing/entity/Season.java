package com.simracing.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.List;

@Entity
@Table(name = "seasons")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Season {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private Integer year;
    private Boolean active;

    @OneToMany(mappedBy = "season", cascade = CascadeType.ALL)
    private List<Race> races;
}