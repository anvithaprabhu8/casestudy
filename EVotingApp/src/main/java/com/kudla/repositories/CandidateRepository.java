package com.kudla.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kudla.entities.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

}
