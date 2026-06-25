package com.simracing.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.simracing.entity.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {

	Optional<Driver> findByGameTag(String gameTag);

}
