package com.psa.locationweb1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.psa.locationweb1.entities.Location;
import com.psa.locationweb1.services.LocationServices;

@Controller
public class LocationController {
	
	@Autowired
	LocationServices ls;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}
	
	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		ls.saveLocation(location);
		modelMap.addAttribute("msg","Location Saved");
		return "createLocation";
	}
	
	@RequestMapping("displayLoc")
	public String displayLoction(ModelMap modelMap) {
		List<Location> findAllLocations = ls.findAllLocations();
		modelMap.addAttribute("locations", findAllLocations);
		return "displayLocation";
	}
	

	
}




