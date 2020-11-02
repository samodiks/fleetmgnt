package com.codesol.fleetmngnt.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codesol.fleetmngnt.model.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
