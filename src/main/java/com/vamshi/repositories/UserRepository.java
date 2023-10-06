package com.vamshi.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vamshi.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByEmail(String email);

}
