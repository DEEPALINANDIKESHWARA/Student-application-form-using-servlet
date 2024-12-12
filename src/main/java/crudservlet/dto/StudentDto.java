package crudservlet.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class StudentDto {
@Id	
private String email;
private String name;
private long mobile;
private String password;
private String gender;
private String country;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long cmob) {
	this.mobile = cmob;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
@Override
public String toString() {
	return "StudentDto [email=" + email + ", name=" + name + ", mobile=" + mobile + ", password=" + password
			+ ", gender=" + gender + ", country=" + country + "]";
}


}
