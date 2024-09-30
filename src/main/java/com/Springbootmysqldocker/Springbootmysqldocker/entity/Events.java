package com.Springbootmysqldocker.Springbootmysqldocker.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="events")
@Entity
public class Events {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eventId;
	
	private String name;
	private Date dateTime;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Users users;
	
	//@OneToMany(cascade = CascadeType.ALL)
	//@JoinColumn(name = "event_id")
	// private List<Users> users;
}
