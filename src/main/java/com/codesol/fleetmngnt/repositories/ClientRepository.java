package com.codesol.fleetmngnt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codesol.fleetmngnt.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
