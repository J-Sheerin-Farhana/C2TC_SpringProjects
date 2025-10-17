package com.placementmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.placementmanagement.model.Placement;
import com.placementmanagement.repository.PlacementRepository;

@RestController
@RequestMapping("/placements")
public class PlacementController {

    @Autowired
    private PlacementRepository repository;

    // CREATE
    @PostMapping
    public Placement addPlacement(@RequestBody Placement placement) {
        return repository.save(placement);
    }

    // READ all
    @GetMapping
    public List<Placement> getAllPlacements() {
        return repository.findAll();
    }

    // READ one
    @GetMapping("/{id}")
    public Placement getPlacement(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Placement updatePlacement(@PathVariable Long id, @RequestBody Placement updatedPlacement) {
        Placement existingPlacement = repository.findById(id).orElse(null);
        if (existingPlacement != null) {
            existingPlacement.setName(updatedPlacement.getName());
            existingPlacement.setCompany(updatedPlacement.getCompany());
            existingPlacement.setRole(updatedPlacement.getRole());
            existingPlacement.setDate(updatedPlacement.getDate());
            existingPlacement.setQualification(updatedPlacement.getQualification());
            existingPlacement.setYear(updatedPlacement.getYear());
            return repository.save(existingPlacement);
        } else {
            return null;
        }
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deletePlacement(@PathVariable Long id) {
        repository.deleteById(id);
        return "Placement with ID " + id + " deleted.";
    }
}