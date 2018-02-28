package com.bike.mountain.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bike.mountain.model.MountainBike;

@Repository
public interface MountainBikeRepository extends JpaRepository<MountainBike, Long> {

	List<MountainBike> findByPriceGreaterThanEqualAndPriceLessThanEqual(@Param("low") BigDecimal low,
			@Param("high") BigDecimal high);

	List<MountainBike> findAllModelsByType(@Param("name") String name);

	List<MountainBike> findByHasRearShockTrue();

	List<MountainBike> findByHasRearShockFalse();
}
