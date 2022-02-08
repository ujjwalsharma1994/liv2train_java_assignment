package com.java.liv2train.api.request;

import java.util.List;

import com.java.liv2train.model.Address;

public class TuitionCenterRequest {

	private String centerName;
	private String centerCode;
	private Address address;
	private int studentCapacity;
	private List<String> coursesOffered;
	private String contactEmail;
	private String contactPhone;

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
		return "TuitionCenterRequest [centerName=" + centerName + ", centerCode=" + centerCode + ", address=" + address
				+ ", studentCapacity=" + studentCapacity + ", coursesOffered=" + coursesOffered + ", contactEmail="
				+ contactEmail + ", contactPhone=" + contactPhone + "]";
	}
}