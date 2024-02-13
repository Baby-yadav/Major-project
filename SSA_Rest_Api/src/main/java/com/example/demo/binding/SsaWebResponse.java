package com.example.demo.binding;

public class SsaWebResponse {
	private Long ssn;
	private String stateName;
	public SsaWebResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SsaWebResponse(Long ssn, String stateName) {
		super();
		this.ssn = ssn;
		this.stateName = stateName;
	}
	public Long getSsn() {
		return ssn;
	}
	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	

}
