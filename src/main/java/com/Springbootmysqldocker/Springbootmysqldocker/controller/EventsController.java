package com.Springbootmysqldocker.Springbootmysqldocker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Springbootmysqldocker.Springbootmysqldocker.entity.Events;
import com.Springbootmysqldocker.Springbootmysqldocker.repo.EventsRepo;

@RestController
public class EventsController {
	@Autowired
	private EventsRepo eventRepo;
	
	
	@GetMapping("/events")
	public List<Events> getAllStudent() {
		return eventRepo.findAll();
	}
	
	@PostMapping("/events")
	public Events insert(@RequestBody Events event) {
		return eventRepo.save(event);
	}
}

