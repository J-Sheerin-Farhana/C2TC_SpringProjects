package com.placementmanagement.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.placementmanagement.exception.ResourceNotFoundException;
import com.placementmanagement.model.Placement;
import com.placementmanagement.repository.PlacementRepository;

@Service
public class PlacementServiceImpl implements PlacementService {

    private final PlacementRepository repo;

    public PlacementServiceImpl(PlacementRepository repo) {
        this.repo = repo;
    }

    @Override
    public Placement createPlacement(Placement placement) {
        return repo.save(placement);
    }

    @Override
    public Placement updatePlacement(Long id, Placement placement) {
        Placement existing = repo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Placement not found with id " + id));
        existing.setName(placement.getName());
        existing.setCompany(placement.getCompany());
        existing.setRole(placement.getRole());
        existing.setDate(placement.getDate());
        return repo.save(existing);
    }

    @Override
    public void deletePlacement(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Placement getPlacement(Long id) {
        return repo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Placement not found with id " + id));
    }

    @Override
    public List<Placement> getAllPlacements() {
        return repo.findAll();
    }
}
