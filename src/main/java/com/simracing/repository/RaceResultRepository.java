package com.simracing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.simracing.entity.RaceResult;

public interface RaceResultRepository extends JpaRepository<RaceResult, Long> {

	List<RaceResult> findByRaceId(Long raceId);

}
