package com.bike.mountain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Manufacturer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	@Column(name = "FOUNDED_DATE")
	private Date foundedDate;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "MANUFACTURER_ID")
	@JsonManagedReference("manufacturer")
	private List<MountainBike> models = new ArrayList<>();

	// GETTERS
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getFoundedDate() {
		return foundedDate;
	}

	public List<MountainBike> getModels() {
		return models;
	}

	// SETTERS
	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFoundedDate(Date foundedDate) {
		this.foundedDate = foundedDate;
	}

	public void setModels(List<MountainBike> models) {
		this.models = models;
	}

}
