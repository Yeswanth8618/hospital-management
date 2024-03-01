package org.jsp.hospitalmanagement.dto;





import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Address {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(nullable = false)
private String Street,buildingname,landmark,area,city,state,country;
@Column(nullable = false)
private int pincode;

public String getStreet() {
	return Street;
}
public void setStreet(String street) {
	Street = street;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getBuildingname() {
	return buildingname;
}
public void setBuildingname(String buildingname) {
	this.buildingname = buildingname;
}
public String getLandmark() {
	return landmark;
}
public void setLandmark(String landmark) {
	this.landmark = landmark;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}


}
