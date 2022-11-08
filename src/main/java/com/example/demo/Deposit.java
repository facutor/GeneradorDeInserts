package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Deposit{
    public Beneficiary beneficiary;
    @JsonProperty("class") 
    public String myclass;
    public Cmc7 cmc7;
    public String depositAccount;
    public String depositCbu;
    public String echeqId;
    public EcheqIssuer echeqIssuer;
    public String issueDate;
    public String paymentDate;
    
    
	public Beneficiary getBeneficiary() {
		return beneficiary;
	}


	public void setBeneficiary(Beneficiary beneficiary) {
		this.beneficiary = beneficiary;
	}


	public String getMyclass() {
		return myclass;
	}


	public void setMyclass(String myclass) {
		this.myclass = myclass;
	}


	public Cmc7 getCmc7() {
		return cmc7;
	}


	public void setCmc7(Cmc7 cmc7) {
		this.cmc7 = cmc7;
	}


	public String getDepositAccount() {
		return depositAccount;
	}


	public void setDepositAccount(String depositAccount) {
		this.depositAccount = depositAccount;
	}


	public String getDepositCbu() {
		return depositCbu;
	}


	public void setDepositCbu(String depositCbu) {
		this.depositCbu = depositCbu;
	}


	public String getEcheqId() {
		return echeqId;
	}


	public void setEcheqId(String echeqId) {
		this.echeqId = echeqId;
	}


	public EcheqIssuer getEcheqIssuer() {
		return echeqIssuer;
	}


	public void setEcheqIssuer(EcheqIssuer echeqIssuer) {
		this.echeqIssuer = echeqIssuer;
	}


	public String getIssueDate() {
		return issueDate;
	}


	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}


	public String getPaymentDate() {
		return paymentDate;
	}


	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}


	@Override
	public String toString() {
		return "Deposit [beneficiary=" + beneficiary + ", myclass=" + myclass + ", cmc7=" + cmc7 + ", depositAccount="
				+ depositAccount + ", depositCbu=" + depositCbu + ", echeqId=" + echeqId + ", echeqIssuer="
				+ echeqIssuer + ", issueDate=" + issueDate + ", paymentDate=" + paymentDate + "]";
	}
}

