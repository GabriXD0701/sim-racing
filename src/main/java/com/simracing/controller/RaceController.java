package com.simracing.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simracing.entity.Race;
import com.simracing.repository.RaceRepository;

@RestController
@RequestMapping("/api/races")
public class RaceController {

    private final RaceRepository raceRepository;

    public RaceController(RaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }

    @GetMapping
    public List<Race> getAllRaces() {
        return raceRepository.findAll();
    }
}
