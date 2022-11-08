package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EcheqIssuer{
    public String businessName;
    @JsonProperty("class") 
    public String myclass;
    public String documentNumber;
    public String documentTypeCode;
    
	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getMyclass() {
		return myclass;
	}

	public void setMyclass(String myclass) {
		this.myclass = myclass;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getDocumentTypeCode() {
		return documentTypeCode;
	}

	public void setDocumentTypeCode(String documentTypeCode) {
		this.documentTypeCode = documentTypeCode;
	}

	@Override
	public String toString() {
		return "EcheqIssuer [businessName=" + businessName + ", myclass=" + myclass + ", documentNumber="
				+ documentNumber + ", documentTypeCode=" + documentTypeCode + "]";
	}
    
}
