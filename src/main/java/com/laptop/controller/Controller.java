package com.laptop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptop.apiresponse.ApiResponse;
import com.laptop.laptopdetailsmodel.LaptopDetailsModel;
import com.laptop.laptopservice.LaptopService;

@RestController
public class Controller {

	@Autowired
 	private LaptopService laptopService;

//	Dummy API for testing

	@GetMapping("/dummy-api")
	public ResponseEntity<ApiResponse> dummyApi() {
		ApiResponse response = laptopService.dummyApi();
		return new ResponseEntity<ApiResponse>(response, HttpStatus.OK);
	}

//	Data Insertion Block

	@PostMapping("/data-insertion")
	public ResponseEntity<ApiResponse> saveData(@RequestBody LaptopDetailsModel laptopDetailsModel) {
		ApiResponse response = laptopService.saveData(laptopDetailsModel);
		return new ResponseEntity<ApiResponse>(response, HttpStatus.OK);
	}

//	Get Data By Id Block

	@GetMapping("/get-data-by-id/{id}")
	public ResponseEntity<ApiResponse> getDataById(@PathVariable("id") Integer id) {
		ApiResponse response = laptopService.getDataById(id);
		return new ResponseEntity<ApiResponse>(response, HttpStatus.OK);
	}

//	Get All Data Block

	@GetMapping("/get-all-data")
	public ResponseEntity<ApiResponse> getAllData() {
		ApiResponse response = laptopService.getAllData();
		return new ResponseEntity<ApiResponse>(response, HttpStatus.OK);

	}

//	Data Updation Block

	@PutMapping("/data-updation-by-id/{id}")
	public ResponseEntity<ApiResponse> dataUpdateById(@PathVariable("id") Integer id,
			@RequestBody LaptopDetailsModel laptopDetailsModel) {
		ApiResponse response = laptopService.dataUpdateById(id, laptopDetailsModel);
		return new ResponseEntity<ApiResponse>(response, HttpStatus.OK);
	}

//	Data Delete By Id Block

	@DeleteMapping("/data-delete-by-id/{id}")
	public ResponseEntity<ApiResponse> dataDeleteById(@PathVariable("id") Integer id) {
		ApiResponse response = laptopService.dataDeleteById(id);
		return new ResponseEntity<ApiResponse>(response, HttpStatus.OK);
	}

//	Data Updation by Patch API

	@PatchMapping("/data-fast-update-by-id/{id}")
	public ResponseEntity<ApiResponse> fastDataUpdationById(@PathVariable("id") Integer id,
			@RequestBody LaptopDetailsModel laptopDetailsModel) {
		ApiResponse response = laptopService.fastDataUpdationById(id, laptopDetailsModel);
		return new ResponseEntity<ApiResponse>(response, HttpStatus.OK);
	}
}
