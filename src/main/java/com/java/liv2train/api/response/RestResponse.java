package com.java.liv2train.api.response;

public class RestResponse {

	public int statusCode;
	public String message;
	public Object data;
	public boolean isSuccess;

	public RestResponse(int statusCode, String message, Object data, boolean isSuccess) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.data = data;
		this.isSuccess = isSuccess;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
}