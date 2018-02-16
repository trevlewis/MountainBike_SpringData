package com.bike.mountain.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bike.mountain.model.Manufacturer;

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long>{
	
	List<Manufacturer> findByFoundedDateBefore(Date date);
	
	List<Manufacturer> findAllByOrderByNameDesc();

}
