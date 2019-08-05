package com.students.domain;

import java.time.LocalDate;
import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import net.sf.cglib.core.Local;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;


public class Student {
	
	private Integer id;
	
 //	@NotBlank(message="Enter First name!")
//	@Size(min=4, max =50)
	private String firstName = null;

 //	@NotBlank
	//@Size(min =4, max=50)
 	private  String lastName  = null;

 //	@NotEmpty
//	@Valid
 	private String email = null;

 //	@NotBlank
 	private String gender = null;
	

//	@Past
    //	@DateTimeFormat(pattern = "dd.MM.yyyy")
 	private Date birthday;
 
//	@NotBlank
    private Phone phone;

  	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}	
	   	
	   

}
