package com.bike.mountain.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bike.mountain.model.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {
	
	List<Model> findByPriceGreaterThanEqualAndPriceLessThanEqual(BigDecimal low, BigDecimal high);	

	List<Model> findAllModelsByType(@Param("name") String name);
	
	List<Model> findByHasRearShockTrue();
	List<Model> findByHasRearShockFalse();
}
