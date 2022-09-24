package com.laptop.laptopserviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptop.apiresponse.ApiResponse;
import com.laptop.globalconstant.GlobalConstant;
import com.laptop.laptopdetails.LaptopDetails;
import com.laptop.laptopdetailsmodel.LaptopDetailsModel;
import com.laptop.laptoprepository.LaptopRepository;
import com.laptop.laptopservice.LaptopService;

@Service
public class LaptopServiceImpl implements LaptopService {

	@Autowired
	private LaptopRepository laptopRepository;

//	Dummy API for testing

	@Override
	public ApiResponse dummyApi() {
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setMessage(GlobalConstant.dummyApi);
		return apiResponse;
	}

//	Data Insertion Block

	@Override
	public ApiResponse saveData(LaptopDetailsModel laptopDetailsModel) {
		// TODO Auto-generated method stub
		ApiResponse apiResponse = new ApiResponse();

		LaptopDetails laptopDetails = new LaptopDetails();

		try {
			laptopDetails.setLaptopName(laptopDetailsModel.getLaptopName());
			laptopDetails.setLaptopModel(laptopDetailsModel.getLaptopModel());
			laptopDetails.setLaptopRam(laptopDetailsModel.getLaptopRam());
			laptopDetails.setLaptopProcessor(laptopDetailsModel.getLaptopProcessor());
			laptopDetails.setLaptopPrice(laptopDetailsModel.getLaptopPrice());
			laptopRepository.save(laptopDetails);
			apiResponse.setMessage(GlobalConstant.dataSaveSuccess);

		} catch (Exception e) {
			// TODO: handle exception
			apiResponse.setMessage(GlobalConstant.dataSavefail);
		}

		return apiResponse;
	}

//	Get Data By Id Block

	@Override
	public ApiResponse getDataById(Integer id) {
		// TODO Auto-generated method stub
		ApiResponse apiResponse = new ApiResponse();
		Optional<LaptopDetails> dbData = laptopRepository.findById(id);
		if (dbData.isEmpty()) {
			apiResponse.setMessage(GlobalConstant.getDataByIdFail);
		} else {
			apiResponse.setLaptopDetails(dbData.get());
			apiResponse.setMessage(GlobalConstant.getDataByIdSuccess);
		}

		return apiResponse;
	}

//	Get All Data Block

	public ApiResponse getAllData() {
		// TODO Auto-generated method stub
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setAllLatopDetails(laptopRepository.findAll());
		return apiResponse;
	}

//	Data Updation Block

	public ApiResponse dataUpdateById(Integer id, LaptopDetailsModel laptopDetailsModel) {
		// TODO Auto-generated method stub
		ApiResponse apiResponse = new ApiResponse();

		Optional<LaptopDetails> dbData = laptopRepository.findById(id);
		if (dbData.isEmpty()) {
			apiResponse.setMessage(GlobalConstant.dataUpdateFail);
		} else {
			LaptopDetails laptopDetails = dbData.get();

			laptopDetails.setLaptopName(laptopDetailsModel.getLaptopName());
			laptopDetails.setLaptopModel(laptopDetailsModel.getLaptopModel());
			laptopDetails.setLaptopRam(laptopDetailsModel.getLaptopRam());
			laptopDetails.setLaptopProcessor(laptopDetailsModel.getLaptopProcessor());
			laptopDetails.setLaptopPrice(laptopDetailsModel.getLaptopPrice());

			laptopRepository.save(laptopDetails);
			apiResponse.setMessage(GlobalConstant.dataUpdateSuccess);
		}
		return apiResponse;
	}

//	Data Delete By Id Block

	public ApiResponse dataDeleteById(Integer id) {
		// TODO Auto-generated method stub
		ApiResponse apiResponse = new ApiResponse();

		Optional<LaptopDetails> dbData = laptopRepository.findById(id);
		if (dbData.isEmpty()) {
			apiResponse.setMessage(GlobalConstant.dataDeletionFail);
		} else {
			laptopRepository.deleteById(id);
			apiResponse.setMessage(GlobalConstant.dataDeleteSuccess);
		}

		return apiResponse;
	}
	
//	Data Updation by Patch API

	public ApiResponse fastDataUpdationById(Integer id, LaptopDetailsModel laptopDetailsModel) {
		// TODO Auto-generated method stub
		ApiResponse apiResponse = new ApiResponse();
		
		Optional<LaptopDetails> dbData = laptopRepository.findById(id);
		if (dbData.isEmpty()) {
			apiResponse.setMessage(GlobalConstant.dataUpdateFail+id);
		}else {
			LaptopDetails laptopDetails = dbData.get();
			laptopDetails.setLaptopName(laptopDetailsModel.getLaptopName());
			laptopRepository.save(laptopDetails);
			apiResponse.setMessage(GlobalConstant.dataUpdateSuccess);
			
		}
		
		return apiResponse;
	}


}



















