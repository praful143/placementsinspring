package com.cg.placements;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Placement Repository Interface
public interface PlacementRepository extends JpaRepository<Placement, String> {

}

