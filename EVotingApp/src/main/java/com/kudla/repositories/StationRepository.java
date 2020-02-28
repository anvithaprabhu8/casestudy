package com.kudla.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kudla.entities.Station;

@Repository
public interface StationRepository extends JpaRepository<Station, Integer> {

}
