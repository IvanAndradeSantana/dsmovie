package com.ivanandradesantana.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ivanandradesantana.dsmovie.entities.Score;
import com.ivanandradesantana.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{}
