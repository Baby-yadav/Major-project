package com.example.demo.binding;

public class SsaWebRequest {
	private String name ;
	private String dob;
	private Long ssn;
	
	
	public SsaWebRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SsaWebRequest(String name, String dob, Long ssn) {
		super();
		this.name = name;
		this.dob = dob;
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Long getSsn() {
		return ssn;
	}
	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}
	
	
	
	

}
