package com.simracing.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simracing.entity.Season;
import com.simracing.repository.SeasonRepository;

@RestController
@RequestMapping("/api/seasons")
public class SeasonController {

    private final SeasonRepository seasonRepository;

    public SeasonController(SeasonRepository seasonRepository) {
        this.seasonRepository = seasonRepository;
    }

    @GetMapping
    public List<Season> getAllSeasons() {
        return seasonRepository.findAll();
    }
}
