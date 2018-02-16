package com.bike.mountain.model;

import java.math.BigDecimal;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
/*
 * TODO Test and modify this query
 */
@NamedQuery(name="Model.findAllModelsByType", query="select m from Model m where m.modeltype.name = :name") 
public class Model {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	private BigDecimal price;
	private String forkBrand;
	private int forkTravel;
	private boolean hasRearShock;
	private Optional<String> rearShockBrand;
	private Optional<Integer> rearShockTravel;
	private double tireSize;
	private String frameMaterial;
	
	@ManyToOne
	private Manufacturer manufacturer;
	
	@ManyToOne
	@JoinColumn(name="MODELTYPE_ID")
	private ModelType modelType;

	//GETTERS
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public String getForkBrand() {
		return forkBrand;
	}

	public int getForkTravel() {
		return forkTravel;
	}
	
	public boolean isHasRearShock() {
		return hasRearShock;
	}

	public Optional<String> getRearShockBrand() {
		return rearShockBrand;
	}

	public Optional<Integer> getRearShockTravel() {
		return rearShockTravel;
	}

	public double getTireSize() {
		return tireSize;
	}

	public String getFrameMaterial() {
		return frameMaterial;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public ModelType getModelType() {
		return modelType;
	}

	//SETTERS
	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public void setForkBrand(String forkBrand) {
		this.forkBrand = forkBrand;
	}

	public void setForkTravel(int forkTravel) {
		this.forkTravel = forkTravel;
	}

	public void setHasRearShock(boolean hasRearShock) {
		this.hasRearShock = hasRearShock;
	}
	
	public void setRearShockBrand(Optional<String> rearShockBrand) {
		this.rearShockBrand = rearShockBrand;
	}

	public void setRearShockTravel(Optional<Integer> rearShockTravel) {
		this.rearShockTravel = rearShockTravel;
	}

	public void setTireSize(double tireSize) {
		this.tireSize = tireSize;
	}

	public void setFrameMaterial(String frameMaterial) {
		this.frameMaterial = frameMaterial;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setModelType(ModelType modelType) {
		this.modelType = modelType;
	}
	
}

