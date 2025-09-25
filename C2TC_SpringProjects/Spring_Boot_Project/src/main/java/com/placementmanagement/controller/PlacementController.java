package com.placementmanagement.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.placementmanagement.model.Placement;
import com.placementmanagement.service.PlacementService;

@RestController
@RequestMapping("/api/placements")
public class PlacementController {

    private final PlacementService service;

    public PlacementController(PlacementService service) {
        this.service = service;
    }

    @PostMapping
    public Placement create(@RequestBody Placement placement) {
        return service.createPlacement(placement);
    }

    @GetMapping("/{id}")
    public Placement getOne(@PathVariable Long id) {
        return service.getPlacement(id);
    }

    @GetMapping
    public List<Placement> getAll() {
        return service.getAllPlacements();
    }

    @PutMapping("/{id}")
    public Placement update(@PathVariable Long id, @RequestBody Placement placement) {
        return service.updatePlacement(id, placement);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deletePlacement(id);
    }
}
