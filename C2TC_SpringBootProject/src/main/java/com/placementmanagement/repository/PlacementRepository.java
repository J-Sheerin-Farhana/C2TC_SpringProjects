package com.placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.placementmanagement.model.Placement;

@Repository
public interface PlacementRepository extends JpaRepository<Placement, Long> {

    // Custom finder methods (optional but useful for filtering)
    List<Placement> findByCompany(String company);
    List<Placement> findByQualification(String qualification);
    List<Placement> findByYear(int year);
}