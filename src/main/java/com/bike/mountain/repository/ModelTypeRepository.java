package com.bike.mountain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bike.mountain.model.ModelType;

@Repository
public interface ModelTypeRepository extends JpaRepository<ModelType, Long> {

	List<ModelType> findAllByOrderByNameAsc();

}
