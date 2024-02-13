package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.binding.SsaWebRequest;
import com.example.demo.binding.SsaWebResponse;
import com.example.demo.service.SsaWebServiceImp;

@RestController
public class SsaRestController {

	@Autowired
	public SsaWebServiceImp ssaService;
	
	@PostMapping("/citizenInfo")
	public SsaWebResponse getCitizenInfo(@RequestBody SsaWebRequest request) {
		SsaWebResponse response=ssaService.getCitizenInfo(request);
		return response;
		
		
	}
	
}
