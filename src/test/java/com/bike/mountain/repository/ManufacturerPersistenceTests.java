package com.bike.mountain.repository;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bike.mountain.model.Manufacturer;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ManufacturerPersistenceTests {
	
	@Autowired
	private ManufacturerRepository manufacturerRepository;
	
	@Test
	public void testFindByFoundedDateBefore() {
		List<Manufacturer> manufacturers = manufacturerRepository.findByFoundedDateBefore(new Date());
		assertEquals(4, manufacturers.size());
	}
	
	@Test
	public void testFindAllByOrderByNameDesc() {
		List<Manufacturer> manufacturers = manufacturerRepository.findAllByOrderByNameDesc();
		assertEquals("Specialized", manufacturers.get(2).getName());
	}

}
