package com.bike.mountain.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MountainBikeControllerTests {

	@Autowired
	private MockMvc mockMvc;

	private static final String URL_ROOT = "/mountainBike/";
	private static final String MIN_PRICE = "4000";
	private static final String MAX_PRICE = "8000";
	private static final String MODEL_TYPE = "Full Supension";

	@Test
	public void testRearShockTrue() throws Exception {
		this.mockMvc.perform(get(URL_ROOT + "rearShockTrue")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Epic XTR Di2")));
	}

	@Test
	public void testRearShockFalse() throws Exception {
		this.mockMvc.perform(get(URL_ROOT + "rearShockFalse")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Fuse")));
	}

	@Test
	public void testModelsInPriceRange() throws Exception {
		this.mockMvc.perform(get(URL_ROOT + "priceRange/" + MIN_PRICE + "/" + MAX_PRICE)).andDo(print())
				.andExpect(status().isOk()).andExpect(content().string(containsString("Jeffsy")));
	}

	@Test
	public void testModelsByType() throws Exception {
		this.mockMvc.perform(get(URL_ROOT + "modelType/" + MODEL_TYPE)).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Enduro")));
	}

}
