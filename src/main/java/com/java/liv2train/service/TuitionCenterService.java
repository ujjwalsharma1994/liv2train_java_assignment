package com.java.liv2train.service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.java.liv2train.api.request.TuitionCenterRequest;
import com.java.liv2train.api.response.RestResponse;

public interface TuitionCenterService {

	ResponseEntity<RestResponse> createATuitionCenter(Optional<TuitionCenterRequest> tuitionCenterRequest);

	ResponseEntity<RestResponse> getATuitionCenter();
}
