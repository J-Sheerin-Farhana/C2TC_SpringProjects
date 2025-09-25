package com.placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.placementmanagement.model.Placement;

public interface PlacementRepository extends JpaRepository<Placement, Long> {}
