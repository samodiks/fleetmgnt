package com.codesol.fleetmngnt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codesol.fleetmngnt.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
