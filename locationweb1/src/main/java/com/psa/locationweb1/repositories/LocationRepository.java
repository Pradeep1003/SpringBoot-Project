package com.psa.locationweb1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.psa.locationweb1.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
