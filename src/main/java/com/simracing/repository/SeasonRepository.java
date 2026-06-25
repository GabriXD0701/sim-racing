package com.simracing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.simracing.entity.Season;

public interface SeasonRepository extends JpaRepository<Season, Long> {

	List<Season> findByActive(Boolean active);

}
