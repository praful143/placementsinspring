package com.cg.placements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

// Placement Service Class
@Service 
@Transactional
public class PlacementService {
	
	// Creation of PlacementRepository object using SpringBoot's Autowiring.
	@Autowired
	private PlacementRepository placementRepository;
	
	// Add service
	public void addPlacement(Placement placement) {
		placementRepository.save(placement);
	}
	
	// Get service
	public Placement searchPlacement(String id) {
		return placementRepository.findById(id).get();
	}
	public List<Placement> listAll(){
		return placementRepository.findAll();
	}
	
	// Delete service
	public void cancelPlacement(String id) {
		placementRepository.deleteById(id);
		
		
	}
	
	// Update service
	public Placement updatePlacement(Placement placement) {
		String id=placement.getId();
		Placement newPlacement=placementRepository.findById(id).get();
		newPlacement.setName(placement.getName());
		newPlacement.setCollege(placement.getCollege());
		newPlacement.setDate(placement.getDate());
		newPlacement.setQualification(placement.getQualification());
		newPlacement.setYear(placement.getYear());
		return placementRepository.save(newPlacement);
	}
	

}