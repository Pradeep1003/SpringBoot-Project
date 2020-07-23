package com.psa.locationweb1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psa.locationweb1.entities.Location;
import com.psa.locationweb1.repositories.LocationRepository;

@Service
public class LocationServicesImpl implements LocationServices {

	@Autowired
	LocationRepository locationRepo;
	
	@Override
	public void saveLocation(Location location) {
		
		locationRepo.save(location);

	}

	@Override
	public List<Location> findAllLocations() {
		List<Location> allRecords = locationRepo.findAll();
		return allRecords;
	}

	

}
