package com.laptop.apiresponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.laptop.laptopdetails.LaptopDetails;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse {

	private String message;

	private LaptopDetails laptopDetails;

	private List<LaptopDetails> allLatopDetails;

//	Getters And Setters

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LaptopDetails getLaptopDetails() {
		return laptopDetails;
	}

	public void setLaptopDetails(LaptopDetails laptopDetails) {
		this.laptopDetails = laptopDetails;
	}

	public List<LaptopDetails> getAllLatopDetails() {
		return allLatopDetails;
	}

	public void setAllLatopDetails(List<LaptopDetails> allLatopDetails) {
		this.allLatopDetails = allLatopDetails;
	}

}
