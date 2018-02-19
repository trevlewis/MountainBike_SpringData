package com.bike.mountain.repository;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bike.mountain.model.Model;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ModelPersistenceTests {
	
	@Autowired
	private ModelRepository modelRepository;
	
	@Test
	public void testFindByPriceGreaterThanEqualAndPriceLessThanEqual() {
		List<Model> models = modelRepository.findByPriceGreaterThanEqualAndPriceLessThanEqual(BigDecimal.valueOf(4000L), BigDecimal.valueOf(8000L));
		assertEquals(9, models.size());
	}
	
	@Test
	public void testFindAllModelsByType() {
		List<Model> models = modelRepository.findAllModelsByType("Hard Tail");
		assertEquals(6, models.size());
	}
	
	@Test
	public void testFindByHasRearShockTrue() {
		List<Model> models = modelRepository.findByHasRearShockTrue();
		assertEquals(12, models.size());
	}
	
	@Test
	public void testFindByHasRearShockFalse() {
		List<Model> models = modelRepository.findByHasRearShockFalse();
		assertEquals(6, models.size());
	}

}
