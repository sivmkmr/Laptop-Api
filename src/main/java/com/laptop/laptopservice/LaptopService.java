package com.laptop.laptopservice;

import com.laptop.apiresponse.ApiResponse;
import com.laptop.laptopdetailsmodel.LaptopDetailsModel;

public interface LaptopService {

	public ApiResponse dummyApi();

	public ApiResponse saveData(LaptopDetailsModel LaptopDetailsModel);

	public ApiResponse getDataById(Integer id);

	public ApiResponse getAllData();

	public ApiResponse dataUpdateById(Integer id, LaptopDetailsModel laptopDetailsModel);

	public ApiResponse dataDeleteById(Integer id);

	public ApiResponse fastDataUpdationById(Integer id, LaptopDetailsModel laptopDetailsModel);

}
