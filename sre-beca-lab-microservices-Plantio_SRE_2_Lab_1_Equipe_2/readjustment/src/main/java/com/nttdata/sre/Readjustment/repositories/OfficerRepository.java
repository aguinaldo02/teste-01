package com.nttdata.sre.Readjustment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdata.sre.Readjustment.entities.Officer;


public interface OfficerRepository extends JpaRepository<Officer, Long> {

}
