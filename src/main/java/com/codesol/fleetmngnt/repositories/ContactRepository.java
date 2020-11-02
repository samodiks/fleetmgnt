package com.codesol.fleetmngnt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codesol.fleetmngnt.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
