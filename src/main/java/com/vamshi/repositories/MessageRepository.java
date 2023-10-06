package com.vamshi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vamshi.entities.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {

}
