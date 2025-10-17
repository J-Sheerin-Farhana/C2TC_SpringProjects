package com.placementmanagement.service;

import java.util.List;
import com.placementmanagement.model.Placement;

public interface PlacementService {
    Placement createPlacement(Placement placement);
    Placement updatePlacement(Long id, Placement placement);
    void deletePlacement(Long id);
    Placement getPlacement(Long id);
    List<Placement> getAllPlacements();
}
