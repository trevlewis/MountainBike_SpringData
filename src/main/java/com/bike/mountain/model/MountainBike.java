package com.bike.mountain.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@NamedQuery(name = "MountainBike.findAllModelsByType", query = "select mtb from MountainBike mtb where mtb.modelType.name = :name")
public class MountainBike {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;
	private BigDecimal price;

	@Column(name = "FORK_BRAND")
	private String forkBrand;

	@Column(name = "FORK_TRAVEL")
	private int forkTravel;

	@Column(name = "HAS_REAR_SHOCK")
	private boolean hasRearShock;

	@Column(name = "REAR_SHOCK_BRAND")
	private String rearShockBrand;

	@Column(name = "REAR_SHOCK_TRAVEL")
	private int rearShockTravel;

	@Column(name = "TIRE_SIZE")
	private double tireSize;

	@Column(name = "FRAME_MATERIAL")
	private String frameMaterial;

	@ManyToOne
	@JsonBackReference("manufacturer")
	private Manufacturer manufacturer;

	@ManyToOne
	@JoinColumn(name = "MODEL_TYPE_ID")
	@JsonBackReference("modelType")
	private ModelType modelType;

	// GETTERS
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

	public String getRearShockBrand() {
		return rearShockBrand;
	}

	public int getRearShockTravel() {
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

	// SETTERS
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

	public void setRearShockBrand(String rearShockBrand) {
		this.rearShockBrand = rearShockBrand;
	}

	public void setRearShockTravel(int rearShockTravel) {
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
