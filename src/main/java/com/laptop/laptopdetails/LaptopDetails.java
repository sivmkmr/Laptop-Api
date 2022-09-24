package com.laptop.laptopdetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class LaptopDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer laptopId;
	private String laptopName;
	private String laptopModel;
	private String laptopRam;
	private String laptopProcessor;
	private String laptopPrice;

//	Getters And Setters

	public Integer getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(Integer laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	public String getLaptopModel() {
		return laptopModel;
	}

	public void setLaptopModel(String laptopModel) {
		this.laptopModel = laptopModel;
	}

	public String getLaptopRam() {
		return laptopRam;
	}

	public void setLaptopRam(String laptopRam) {
		this.laptopRam = laptopRam;
	}

	public String getLaptopProcessor() {
		return laptopProcessor;
	}

	public void setLaptopProcessor(String laptopProcessor) {
		this.laptopProcessor = laptopProcessor;
	}

	public String getLaptopPrice() {
		return laptopPrice;
	}

	public void setLaptopPrice(String laptopPrice) {
		this.laptopPrice = laptopPrice;
	}

}
