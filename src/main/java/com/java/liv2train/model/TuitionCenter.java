package com.java.liv2train.model;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;


//@Document(collection = "tuition_centers")
public class TuitionCenter {

//	@Id
	private int trainingCenterId;
	@Size(min = 0, max = 40, message = "Center Name should be less than 40")
	private String centerName;
	@Size(min = 12, max = 12, message = "Center code should be exactly 12 characters")
	@NotNull(message = "center code cannot be null")
	private String centerCode;
	private Address address;
	private int studentCapacity;
	private List<String> coursesOffered;
	private long createdOn;
	@Email(message = "Email should be valid")
	private String contactEmail;
	@Pattern(regexp="(^$|[0-9]{10})", message = "Provide a valid phone number")
	private String contactPhone;

	public int getTrainingCenterId() {
		return trainingCenterId;
	}

	public void setTrainingCenterId(int trainingCenterId) {
		this.trainingCenterId = trainingCenterId;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getCenterCode() {
		return centerCode;
	}

	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getStudentCapacity() {
		return studentCapacity;
	}

	public void setStudentCapacity(int studentCapacity) {
		this.studentCapacity = studentCapacity;
	}

	public List<String> getCoursesOffered() {
		return coursesOffered;
	}

	public void setCoursesOffered(List<String> coursesOffered) {
		this.coursesOffered = coursesOffered;
	}

	public long getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(long createdOn) {
		this.createdOn = createdOn;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	@Override
	public String toString() {
		return "TrainingCenter [centerName=" + centerName + ", centerCode=" + centerCode + ", address=" + address
				+ ", studentCapacity=" + studentCapacity + ", coursesOffered=" + coursesOffered + ", createdOn="
				+ createdOn + ", contactEmail=" + contactEmail + ", contactPhone=" + contactPhone + "]";
	}

}