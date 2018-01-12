package com.bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ShippingAddress {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String ShippingAddressName;
	private String ShippingAddressStreet1;
	private String ShippingAddressStreet2;
	private String ShippingAddressCity;
	private String ShippingAddressState;
	private String ShippingAddressCountry;
	private String ShippingAddressZipcode;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserShippingName() {
		return ShippingAddressName;
	}

	public void setUserShippingName(String ShippingAddressName) {
		this.ShippingAddressName = ShippingAddressName;
	}

	public String getUserShippingStreet1() {
		return ShippingAddressStreet1;
	}

	public void setUserShippingStreet1(String ShippingAddressStreet1) {
		this.ShippingAddressStreet1 = ShippingAddressStreet1;
	}

	public String getUserShippingStreet2() {
		return ShippingAddressStreet2;
	}

	public void setUserShippingStreet2(String ShippingAddressStreet2) {
		this.ShippingAddressStreet2 = ShippingAddressStreet2;
	}

	public String getUserShippingCity() {
		return ShippingAddressCity;
	}

	public void setUserShippingCity(String ShippingAddressCity) {
		this.ShippingAddressCity = ShippingAddressCity;
	}

	public String getUserShippingState() {
		return ShippingAddressState;
	}

	public void setUserShippingState(String ShippingAddressState) {
		this.ShippingAddressState = ShippingAddressState;
	}

	public String getUserShippingCountry() {
		return ShippingAddressCountry;
	}

	public void setUserShippingCountry(String ShippingAddressCountry) {
		this.ShippingAddressCountry = ShippingAddressCountry;
	}

	public String getUserShippingZipcode() {
		return ShippingAddressZipcode;
	}

	public void setUserShippingZipcode(String ShippingAddressZipcode) {
		this.ShippingAddressZipcode = ShippingAddressZipcode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
