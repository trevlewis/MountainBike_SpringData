package com.bike.mountain.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bike.mountain.model.MountainBike;
import com.bike.mountain.repository.MountainBikeRepository;

@RestController()
@RequestMapping("/mountainBike")
public class MountainBikeController {

	@Autowired
	private MountainBikeRepository modelRepository;

	@RequestMapping("/rearShockTrue")
	public List<MountainBike> modelsRearShockTrue() {
		return modelRepository.findByHasRearShockTrue();
	}

	@RequestMapping("/rearShockFalse")
	public List<MountainBike> modelsRearShockFalse() {
		return modelRepository.findByHasRearShockFalse();
	}

	@RequestMapping("/priceRange/{min}/{max}")
	public List<MountainBike> modelsInPriceRange(@PathVariable("min") BigDecimal min,
			@PathVariable("max") BigDecimal max) {
		return modelRepository.findByPriceGreaterThanEqualAndPriceLessThanEqual(min, max);
	}

	@RequestMapping("/modelType/{type}")
	public List<MountainBike> allModelsByType(@PathVariable("type") String modelType) {
		return modelRepository.findAllModelsByType(modelType);
	}

	/**
	 * This just saves the MountainBike object. It does not link the Manufacturer or
	 * ModelType objects. Just to demonstrate Spring Data JPA generated repository
	 * methods.
	 * 
	 * @param mtbModel
	 * @return the created MountainBike
	 */
	@RequestMapping(value = "/addMountainBike", method = RequestMethod.POST)
	public @ResponseBody MountainBike addNewMountainBike(@RequestBody MountainBike mtbModel) {
		return modelRepository.saveAndFlush(mtbModel);
	}

}
