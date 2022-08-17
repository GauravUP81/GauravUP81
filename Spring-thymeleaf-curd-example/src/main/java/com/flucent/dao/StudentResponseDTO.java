package com.flucent.dao;



import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.ObjectUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentResponseDTO {

    private String id;
    private String name;
    private String email;
    private LocalDate birthday;

    private String zipCode;
    private String street;
    private String number;
    private String complement;
    private String district;
    private String city;
    private String state;

    private LocalDateTime createdAt;

    
    
    public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public LocalDate getBirthday() {
		return birthday;
	}



	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}



	public String getZipCode() {
		return zipCode;
	}



	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}



	public String getComplement() {
		return complement;
	}



	public void setComplement(String complement) {
		this.complement = complement;
	}



	public String getDistrict() {
		return district;
	}



	public void setDistrict(String district) {
		this.district = district;
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



	public LocalDateTime getCreatedAt() {
		return createdAt;
	}



	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}



	@JsonProperty(value = "age")
    public Integer getAge() {
        if (ObjectUtils.isEmpty(this.birthday)) {
            return null;
        }
        return Period.between(this.birthday, LocalDate.now()).getYears();
    }

}
