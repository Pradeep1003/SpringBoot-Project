package com.psa.locationweb1.services;

import java.util.List;

import com.psa.locationweb1.entities.Location;

public interface LocationServices {
	
	void saveLocation(Location location);
	List<Location> findAllLocations();
	

}
