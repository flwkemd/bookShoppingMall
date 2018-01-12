package com.bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BillingAddress {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String BillingAddressName;
	private String BillingAddressStreet1;
	private String BillingAddressStreet2;
	private String BillingAddressCity;
	private String BillingAddressState;
	private String BillingAddressCountry;
	private String BillingAddressZipcode;
	
	@OneToOne
	private Order order;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserBillingName() {
		return BillingAddressName;
	}

	public void setUserBillingName(String BillingAddressName) {
		this.BillingAddressName = BillingAddressName;
	}

	public String getUserBillingStreet1() {
		return BillingAddressStreet1;
	}

	public void setUserBillingStreet1(String BillingAddressStreet1) {
		this.BillingAddressStreet1 = BillingAddressStreet1;
	}

	public String getUserBillingStreet2() {
		return BillingAddressStreet2;
	}

	public void setUserBillingStreet2(String BillingAddressStreet2) {
		this.BillingAddressStreet2 = BillingAddressStreet2;
	}

	public String getUserBillingCity() {
		return BillingAddressCity;
	}

	public void setUserBillingCity(String BillingAddressCity) {
		this.BillingAddressCity = BillingAddressCity;
	}

	public String getUserBillingState() {
		return BillingAddressState;
	}

	public void setUserBillingState(String BillingAddressState) {
		this.BillingAddressState = BillingAddressState;
	}

	public String getUserBillingCountry() {
		return BillingAddressCountry;
	}

	public void setUserBillingCountry(String BillingAddressCountry) {
		this.BillingAddressCountry = BillingAddressCountry;
	}

	public String getUserBillingZipcode() {
		return BillingAddressZipcode;
	}

	public void setUserBillingZipcode(String BillingAddressZipcode) {
		this.BillingAddressZipcode = BillingAddressZipcode;
	}
	
}