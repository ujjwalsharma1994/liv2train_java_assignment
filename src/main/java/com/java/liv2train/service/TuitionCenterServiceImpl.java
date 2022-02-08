package com.java.liv2train.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolation;
import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.java.liv2train.api.request.TuitionCenterRequest;
import com.java.liv2train.api.response.RestResponse;
import com.java.liv2train.config.ValidationConfig;
import com.java.liv2train.model.TuitionCenter;

@Service
public class TuitionCenterServiceImpl implements TuitionCenterService {

//	@Autowired
//	private TuitionCenterRepository tuitionCenterRepository;
	@Autowired
	private ValidationConfig validationConfig;
	
	@Override
	public ResponseEntity<RestResponse> createATuitionCenter(Optional<TuitionCenterRequest> tuitionCenterRequest) {

		if (tuitionCenterRequest.isPresent()) { // check if the data coming is null or not.
			try {
				TuitionCenter tuitionCenter = new TuitionCenter(); // create object of tuition center
				
				TuitionCenterRequest tuitionCenterOptionalData = tuitionCenterRequest.get();
				
				tuitionCenter.setAddress(tuitionCenterOptionalData.getAddress());
				tuitionCenter.setCenterCode(tuitionCenterOptionalData.getCenterCode());
				tuitionCenter.setCenterName(tuitionCenterOptionalData.getCenterName());
				tuitionCenter.setContactEmail(tuitionCenterOptionalData.getContactEmail());
				tuitionCenter.setContactPhone(tuitionCenterOptionalData.getContactPhone());
				tuitionCenter.setCoursesOffered(tuitionCenterOptionalData.getCoursesOffered());
				tuitionCenter.setCreatedOn(System.currentTimeMillis());
				tuitionCenter.setStudentCapacity(tuitionCenterOptionalData.getStudentCapacity());
				
				// it will check in which fields the violation of rule has been practised.
				Set<ConstraintViolation<TuitionCenter>> violations = validationConfig.getValidator().validate(tuitionCenter);

				if (!(violations.size() > 0)) { // if size of error(s) is greater than 0 then show the errors in the response.
					return ResponseEntity.status(409).body(new RestResponse(409, "Error(s) occured.", 
							violations.stream().map(e->e.getMessage()).collect(Collectors.toList()), false));
				}else {
//					tuitionCenterRepository.save(tuitionCenter);
					return ResponseEntity.ok().body(new RestResponse(200, "Tuition center created successfully", tuitionCenter, true));
				}
			}catch (ValidationException e) {
	
				return ResponseEntity.status(409).body(new RestResponse(409, e.getMessage(), null, false));
			}
		}else // handle null data situation
			return ResponseEntity.status(409).body(new RestResponse(409, "Please provide valid details.", null, false));
	}

	@Override
	public ResponseEntity<RestResponse> getATuitionCenter() {
		
		List<TuitionCenter> tuitionCenters = new ArrayList<TuitionCenter>();
		
		TuitionCenter tuitionCenter = new TuitionCenter();
		tuitionCenter.setAddress(null);
		tuitionCenter.setCenterCode("SATA1234BCBA");
		tuitionCenter.setCenterName("Habib");
		tuitionCenter.setContactEmail("ujjwalsharma@gmail.com");
		tuitionCenter.setContactPhone("9149616132");
		tuitionCenter.setCoursesOffered(Arrays.asList("Maths"));
		tuitionCenter.setCreatedOn(System.currentTimeMillis());
		tuitionCenter.setStudentCapacity(12);
		
		tuitionCenters.add(tuitionCenter);
		
		//QUERY to fetch all the records that exist in tuition centers collection
		
		Set<ConstraintViolation<TuitionCenter>> violations = validationConfig.getValidator().validate(tuitionCenter);
		
		if (!(violations.size() > 0)) // if size of records is more than 1
			return ResponseEntity.ok(new RestResponse(200, tuitionCenters.size()+" center(s) found", tuitionCenters, true));
		else // else show empty data in response
			return ResponseEntity.status(409).body(new RestResponse(409, "ERROR", violations.stream().map(e->e.getMessage()).collect(Collectors.toList()), false));
	}
}