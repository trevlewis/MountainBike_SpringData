package com.bike.mountain.repository;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bike.mountain.model.MountainBike;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MountainBikePersistenceTests {

	@Autowired
	private MountainBikeRepository modelRepository;

	@Test
	public void testFindByPriceGreaterThanEqualAndPriceLessThanEqual() {
		List<MountainBike> models = modelRepository
				.findByPriceGreaterThanEqualAndPriceLessThanEqual(BigDecimal.valueOf(4000L), BigDecimal.valueOf(8000L));
		assertEquals(9, models.size());
	}

	@Test
	public void testFindAllModelsByType() {
		List<MountainBike> models = modelRepository.findAllModelsByType("Hard Tail");
		assertEquals(6, models.size());
	}

	@Test
	public void testFindByHasRearShockTrue() {
		List<MountainBike> models = modelRepository.findByHasRearShockTrue();
		assertEquals(12, models.size());
	}

	@Test
	public void testFindByHasRearShockFalse() {
		List<MountainBike> models = modelRepository.findByHasRearShockFalse();
		assertEquals(6, models.size());
	}

}
