package com.simracing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.simracing.entity.Race;

public interface RaceRepository extends JpaRepository<Race, Long> {

	List<Race> findBySeasonId(Long seasonId);

}
