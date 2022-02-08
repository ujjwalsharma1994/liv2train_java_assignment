package com.java.liv2train.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.liv2train.api.request.TuitionCenterRequest;
import com.java.liv2train.api.response.RestResponse;
import com.java.liv2train.service.TuitionCenterService;

@RestController
@RequestMapping("/tuition_center")
public class TuitionCenterController {

	@Autowired
	private TuitionCenterService tuitionCenterService;
	
	@PostMapping(path = "/create")
	public ResponseEntity<RestResponse> createATuitionCenter(@RequestBody TuitionCenterRequest tuitionCenterRequest) {

		Optional<TuitionCenterRequest> optionalTuitionCenterRequest = Optional.of(tuitionCenterRequest);
		return tuitionCenterService.createATuitionCenter(optionalTuitionCenterRequest);
	}
	
	@GetMapping(path = "/find_all")
	public ResponseEntity<RestResponse> findAllTuitionCenters() {

		return tuitionCenterService.getATuitionCenter();
	}
}
