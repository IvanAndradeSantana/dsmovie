package com.ivanandradesantana.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ivanandradesantana.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{}
