package com.Springbootmysqldocker.Springbootmysqldocker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Springbootmysqldocker.Springbootmysqldocker.entity.Events;

public interface EventsRepo extends JpaRepository<Events, Integer>{
	
}
