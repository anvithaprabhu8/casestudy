package com.kudla.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kudla.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
