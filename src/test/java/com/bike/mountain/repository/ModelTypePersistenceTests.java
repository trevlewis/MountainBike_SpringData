package com.bike.mountain.repository;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bike.mountain.model.ModelType;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ModelTypePersistenceTests {

	@Autowired
	private ModelTypeRepository modelTypeRepository;

	@Test
	public void testFindAllByOrderByNameAsc() {
		List<ModelType> types = modelTypeRepository.findAllByOrderByNameAsc();
		assertEquals("Hard Tail", types.get(1).getName());
	}

}
