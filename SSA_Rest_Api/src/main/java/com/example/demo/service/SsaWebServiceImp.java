package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.binding.SsaWebRequest;
import com.example.demo.binding.SsaWebResponse;


@Service
public class SsaWebServiceImp implements SsaWebService {
	
	SsaWebResponse response= new SsaWebResponse();

	@Override
	public SsaWebResponse getCitizenInfo(SsaWebRequest request) {
		// TODO Auto-generated method stub
		Long ssn =request.getSsn();
		
		//convert to String format
		String ssnStr=String.valueOf(ssn);
		response.setSsn(ssn);
		
		
		if(ssnStr.startsWith("1")) {
			response.setStateName("New Jersey");
			
		}else if(ssnStr.startsWith("2")){
			response.setStateName("Texas");
			
			
		}else if(ssnStr.startsWith("3")){
			response.setStateName("Dallas");
			
		}else if(ssnStr.startsWith("4")) {
			response.setStateName("Rhode Island");
			
		}else if(ssnStr.startsWith("5")){
			response.setStateName("Ohio");
			
		}else if(ssnStr.startsWith("6")) {
			response.setStateName("Albama");
			
		}else if(ssnStr.startsWith("7")) {
			response.setStateName("California");
			
		}else if(ssnStr.startsWith("8")) {
			response.setStateName("Standaford");
			
		}else if(ssnStr.startsWith("9")) {
			response.setStateName("kentucky");
				
	     }
		
		return response;
	
	

}
}
