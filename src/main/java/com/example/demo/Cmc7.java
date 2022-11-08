package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cmc7{
    public String accountNumber;
    public String bankCode;
    public String branchCode;
    @JsonProperty("class") 
    public String myclass;
    public String echeckNumber;
    public String postalCode;
    
    
	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getBankCode() {
		return bankCode;
	}


	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}


	public String getBranchCode() {
		return branchCode;
	}


	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}


	public String getMyclass() {
		return myclass;
	}


	public void setMyclass(String myclass) {
		this.myclass = myclass;
	}


	public String getEcheckNumber() {
		return echeckNumber;
	}


	public void setEcheckNumber(String echeckNumber) {
		this.echeckNumber = echeckNumber;
	}


	public String getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	@Override
	public String toString() {
		return "Cmc7 [accountNumber=" + accountNumber + ", bankCode=" + bankCode + ", branchCode=" + branchCode
				+ ", myclass=" + myclass + ", echeckNumber=" + echeckNumber + ", postalCode=" + postalCode + "]";
	}
    
    
}
