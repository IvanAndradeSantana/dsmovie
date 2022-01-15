package com.ivanandradesantana.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ivanandradesantana.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{}