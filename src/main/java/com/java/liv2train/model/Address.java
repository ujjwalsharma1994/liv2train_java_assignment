package com.java.liv2train.model;

public class Address {

	private int addressId;
	private String detailedAddress;
	private String city;
	private String state;
	private String pincode;
	private TuitionCenter tuitionCenterId;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public TuitionCenter getTuitionCenterId() {
		return tuitionCenterId;
	}

	public void setTuitionCenterId(TuitionCenter tuitionCenter) {
		this.tuitionCenterId = tuitionCenter;
	}

	public String getDetailedAddress() {
		return detailedAddress;
	}

	public void setDetailedAddress(String detailedAddress) {
		this.detailedAddress = detailedAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [detailedAddress=" + detailedAddress + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + "]";
	}

}