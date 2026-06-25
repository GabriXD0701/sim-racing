package com.simracing.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.simracing.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

	Optional<Team> findByName(String name);

}
