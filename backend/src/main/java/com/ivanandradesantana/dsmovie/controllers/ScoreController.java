package com.ivanandradesantana.dsmovie.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivanandradesantana.dsmovie.dto.MovieDTO;
import com.ivanandradesantana.dsmovie.dto.ScoreDTO;
import com.ivanandradesantana.dsmovie.services.ScoreServices;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController 
{
	@Autowired
	private ScoreServices service;
	
	@PutMapping
	public MovieDTO saveScpre(@RequestBody ScoreDTO dto)
	{
		MovieDTO movieDTO = service.saveScore(dto);
		return movieDTO;
	}
}
