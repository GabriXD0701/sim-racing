package com.simracing.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simracing.entity.RaceResult;
import com.simracing.repository.RaceResultRepository;

@RestController
@RequestMapping("/api/race-results")
public class RaceResultController {

    private final RaceResultRepository raceResultRepository;

    public RaceResultController(RaceResultRepository raceResultRepository) {
        this.raceResultRepository = raceResultRepository;
    }

    @GetMapping
    public List<RaceResult> getAllRaceResults() {
        return raceResultRepository.findAll();
    }
}
